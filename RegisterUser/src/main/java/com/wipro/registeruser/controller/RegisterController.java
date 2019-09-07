package com.wipro.registeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.wipro.registeruser.service.UserService;


@Controller
public class RegisterController {
	
	@Autowired
	UserService userService;
}
