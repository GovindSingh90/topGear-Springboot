package com.bank.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bank.wipro.controller.AccountController;



@SpringBootApplication
public class BankingDemoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cfg = SpringApplication.run(BankingDemoApplication.class, args);
		AccountController accountController = cfg.getBean("accountController", AccountController.class);
		accountController.saveEntity();
	}

}
