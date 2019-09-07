package com.bank.wipro.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.wipro.model.Customer;



 
@Repository
@Transactional
public interface CustomerDao extends CrudRepository<Customer, Integer> {
 
	
}
