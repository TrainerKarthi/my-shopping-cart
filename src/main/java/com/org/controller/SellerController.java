package com.org.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.dao.SellerDao;
import com.org.dto.Seller;

@Controller
public class SellerController {

	@Autowired
	private SellerDao sellerDao;

	@PostMapping("/seller_register")
	public ModelAndView saveSeller(@ModelAttribute Seller seller) {

		sellerDao.saveAndUpdateSeller(seller);

		ModelAndView mav = new ModelAndView("seller/seller_register.jsp");
		mav.addObject("seller_register", "Registration Successful");

		return mav;

	}

	@PostMapping("/seller_login")
	public ModelAndView verifySeller(@RequestParam String email, @RequestParam String password, HttpSession session) {

		List<Seller> seller = sellerDao.fetchSellerByEmailAndPassword(email, password);

		if (seller.isEmpty()) {
			ModelAndView mav = new ModelAndView("seller/seller_login.jsp");
			mav.addObject("invalid", "Invalid Credentials");
			return mav;
		}
		session.setAttribute("sellerId", seller.get(0).getId());
		return new ModelAndView("seller/seller_home.jsp");
	}
	@GetMapping("/seller_logout")
	public ModelAndView sellerLogout(HttpSession session) {
		ModelAndView mav = new ModelAndView("seller/seller_login.jsp");
		
		session.invalidate();
		
		mav.addObject("success","Logout Successful");
		
		return mav;
	}
}
