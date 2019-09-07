package com.bank.wipro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.wipro.model.Account;
import com.bank.wipro.model.Customer;
import com.bank.wipro.services.AccountService;



@RestController
public class AccountController {

	@Autowired(required=false)
	private AccountService accountService;
	
	@GetMapping(value="/saveData")
	public void saveEntity() {
		Customer custObj = new Customer(1,"Rohit");
		Customer custObj1 = new Customer(2,"Raju");
		Customer custObj2 = new Customer(3,"Govind");
		Customer custObj3 = new Customer(4,"shyam");
		accountService.saveCustData(custObj);
		accountService.saveCustData(custObj1);
		accountService.saveCustData(custObj2);
		accountService.saveCustData(custObj3);
		
		Account accObj = new Account(1,custObj.getId(),203.30);
		Account accObj1 = new Account(2,custObj1.getId(),623.44);
		Account accObj2 = new Account(3,custObj2.getId(),543.41);
		Account accObj3 = new Account(4,custObj3.getId(),953.90);
		accountService.saveData(accObj);
		accountService.saveData(accObj1);
		accountService.saveData(accObj2);
		accountService.saveData(accObj3);
	}
	
	
	@GetMapping(value="/accountList")
	public List<Account> getList() {
		return accountService.getList();
	}
	
	@PutMapping(value="/update/{id}")
	public Account update(@PathVariable Integer id, @RequestBody Account bean) {
		return accountService.updateData(id,bean);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void delete(@PathVariable Integer id) {
		accountService.deleteData(id);
	}
	
	@GetMapping(value="/getById/{id}")
	public Optional<Account> getById(@PathVariable Integer id) {
		return accountService.getDtlsById(id);
	}
	
	
}
