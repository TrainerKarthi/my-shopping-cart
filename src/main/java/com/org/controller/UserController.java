package com.org.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.dao.UserDao;
import com.org.dto.User;

@Controller
public class UserController {

	@Autowired
	private UserDao userDao;

	@PostMapping("/user_register")
	public ModelAndView saveUser(@ModelAttribute User user) {

		userDao.saveAndUpdateUser(user);

		ModelAndView mav = new ModelAndView("user/user_registration.jsp");
		mav.addObject("user_register", "Registration Successful");

		return mav;

	}

	@PostMapping("/user_login")
	public ModelAndView verifyUser(@RequestParam String email, @RequestParam String password, HttpSession session) {

		List<User> user = userDao.fetchUserByEmailAndPassword(email, password);

		if (user.isEmpty()) {
			ModelAndView mav = new ModelAndView("user/user_login.jsp");
			mav.addObject("invalid", "Invalid Credentials");
			return mav;
		}
		session.setAttribute("userId", user.get(0).getId());
		return new ModelAndView("user/user_home.jsp");
	}

}
