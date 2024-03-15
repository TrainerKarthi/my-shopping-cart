package com.org.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.dao.ItemDao;
import com.org.dao.ProductDao;
import com.org.dao.UserDao;
import com.org.dto.Item;
import com.org.dto.Product;
import com.org.dto.User;

@Controller
public class ItemController {

	@Autowired
	private ProductDao productDao;

	@Autowired
	private ItemDao itemDao;

	@Autowired
	private UserDao userDao;

	@GetMapping("/add_to_cart")
	public ModelAndView addToCart(@RequestParam int productId, HttpSession session) {
		ModelAndView mav = new ModelAndView("user/user_home.jsp");

		Product product = productDao.fetchProductById(productId);

		Item item = new Item();
		item.setId(product.getId());
		item.setName(product.getName());
		item.setDescription(product.getDescription());
		item.setPrice(product.getPrice());
		item.setProductType(product.getProductType());
		item.setStockLeft(product.getStockLeft());

		System.out.println(item.getId());
		int userId = (int) session.getAttribute("userId");

		User user = userDao.fetchUserById(userId);

		List<Item> items = new ArrayList<Item>();

		item.setUsers(user);
		user.setItems(items);

		mav.addObject("success", "Item Added Successfully");
		itemDao.saveAndUpdateItem(item);

		return mav;
	}

}
