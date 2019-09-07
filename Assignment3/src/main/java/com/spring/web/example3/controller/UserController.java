package com.spring.web.example3.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.web.example3.model.User;
import com.spring.web.example3.service.UserService;

@Controller
@RequestMapping("app")
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	@GetMapping("create-user")
	public ModelAndView createUserView() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user-creation");
		mv.addObject("user", new User());
		mv.addObject("allProfiles", getProfiles());
		
		return mv;
	}
	
	@PostMapping("create-user")
	public ModelAndView createUser(@Valid User user, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		if(result.hasErrors()) {
			logger.info("validation error while submitting form");
			mv.setViewName("user-creation");
			mv.addObject("user", new User());
			mv.addObject("allProfiles", getProfiles());
			return mv;
		}
		
		userService.addUser(user);
		mv.addObject("allUsers", userService.getAllUser());
		mv.setViewName("user-info");
		logger.info(" form submitted successfully");
		return mv;
		
	}
	
	public List<String> getProfiles(){
		List<String> list  = new ArrayList<>();
		list.add("developer");
		list.add("manager");
		list.add("director");
		return list;
	}
	

}
