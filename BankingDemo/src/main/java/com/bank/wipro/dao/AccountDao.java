package com.bank.wipro.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.wipro.model.Account;



 
@Repository
@Transactional
public interface AccountDao extends CrudRepository<Account, Integer> {
 
	
}
