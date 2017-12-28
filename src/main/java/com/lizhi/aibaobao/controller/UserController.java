package com.lizhi.aibaobao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lizhi.aibaobao.model.UserModel;
import com.lizhi.aibaobao.service.IUserService;



@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService = null;
	
	@RequestMapping(value="/insertUser")
	public String insertUser(UserModel userModel){
		//int num = this.userService.insertUser(userModel);
		return null;
	}
}
