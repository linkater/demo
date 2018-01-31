package org.demo.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.domain.User;
import org.demo.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController{
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/queryUsers")
	public ModelAndView queryUsers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		  ModelAndView modelAndView = new ModelAndView();
		  List<User> userList = userService.queryUsers();
		  modelAndView.addObject("user", userList.get(0));
		  modelAndView.setViewName("mypage");
		  return modelAndView;
		 }
}
