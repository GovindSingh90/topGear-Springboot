package com.spring.web.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	
	@RequestMapping("bank")
	@ResponseBody
	public String displayBankName() {
		return "U.S.BANK";
	}
	
	@RequestMapping("address")
	@ResponseBody
	public String displayAddress() {
		return "NewYork";
	}
}
