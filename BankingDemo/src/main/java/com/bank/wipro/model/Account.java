package com.bank.wipro.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="account")
public class Account implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="customer_id")
	private Integer customer;
	
	@Column(name="balance")
	private double balance;
	
	public Account() {}
	
	public Account(Integer id, Integer customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomer() {
		return customer;
	}

	public void setCustomer(Integer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
