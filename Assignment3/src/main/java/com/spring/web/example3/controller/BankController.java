package com.spring.web.example3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankController {

	@RequestMapping(value="/service", method=RequestMethod.GET )
	//@ResponseBody
	public String bankService() {
	
		return "services";
	}

	@RequestMapping(value="/branch", method=RequestMethod.GET )
	//@ResponseBody
	public String showWelcome( ) {
		//System.out.println("Name is:"+name);
		
		return "bank";
		
		}
	}

