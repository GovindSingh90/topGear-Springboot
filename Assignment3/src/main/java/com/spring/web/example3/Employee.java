/*package com.spring.web.example3;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Employee {
	
	@Value("${welcome.message}")
	private String message;
	
	@RequestMapping("/add")
	public String addEmployee(Map<String, Object> model) {
		model.put("message", this.message);
		
		return "welcome";
	}

}
*/