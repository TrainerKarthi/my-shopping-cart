package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.dto.Seller;
import com.org.dto.User;

@Controller
public class TestController {

	
	@RequestMapping("/emptyUser")
	public ModelAndView emptyUser() {
		ModelAndView mav = new ModelAndView("user/user_registration.jsp");
		User user = new User();
		mav.addObject("user", user);
		
		return mav;
	}
	
	@RequestMapping("/emptySeller")
	public ModelAndView emptySeller() {
		ModelAndView mav = new ModelAndView("seller/seller_register.jsp");
		Seller seller = new Seller();
		mav.addObject("seller", seller);
		
		return mav;
	}
}
