package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.dao.OrdersDao;

@Controller
public class OrdersController {

	@Autowired
	private OrdersDao ordersDao;
	
	
}
