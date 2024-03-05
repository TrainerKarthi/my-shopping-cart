package com.org.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.dao.ProductDao;
import com.org.dao.SellerDao;
import com.org.dto.Product;
import com.org.dto.Seller;

@Controller
public class ProductController {

	@Autowired
	private ProductDao productDao;

	@Autowired
	private SellerDao dao;

	@PostMapping("/add_product")
	public ModelAndView saveProduct(@ModelAttribute Product product, HttpSession session) {

		int sellerId = (Integer) session.getAttribute("sellerId");

		Seller seller = dao.fetchSellerById(sellerId);

		System.out.println(seller);

		product.setSeller(seller);

		List<Product> list = seller.getProducts();

		list.add(product);

		seller.setProducts(list);

		productDao.saveAndUpdateProduct(product);

		ModelAndView mav = new ModelAndView("seller/add_product.jsp");
		mav.addObject("success", "Registration Successful");

		return mav;

	}

	@GetMapping("/view_products")
	public ModelAndView viewProducts(HttpSession session) {

		int sellerId = (Integer) session.getAttribute("sellerId");

		Seller seller = dao.fetchSellerById(sellerId);

		List<Product> list = seller.getProducts();

		ModelAndView mav = new ModelAndView("seller/view_products.jsp");
		mav.addObject("products", list);

		return mav;

	}

}
