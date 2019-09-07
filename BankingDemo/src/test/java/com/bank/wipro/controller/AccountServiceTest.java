package com.bank.wipro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.wipro.dao.AccountDao;
import com.bank.wipro.dao.CustomerDao;
import com.bank.wipro.model.Account;
import com.bank.wipro.model.Customer;


@Service
public class AccountServiceTest {

	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private CustomerDao customerDao;

	public void saveData(Account account) {
		accountDao.save(account);
	}

	public void saveCustData(Customer custObj) {
		customerDao.save(custObj);
	}

	public List<Account> getList() {
		return (List<Account>) accountDao.findAll();
	}

	public Account updateData(Integer id, Account bean) {
		Optional<Account> beanObj = accountDao.findById(id);
		Account obj = beanObj.get();
		obj.setBalance(bean.getBalance());
		return accountDao.save(obj);
	}

	public void deleteData(Integer id) {
		accountDao.deleteById(id);
	}

	public Optional<Account> getDtlsById(Integer id) {
		return accountDao.findById(id);
	}
	
}
