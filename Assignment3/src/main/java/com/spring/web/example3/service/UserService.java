package com.spring.web.example3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.web.example3.model.User;

@Service
public class UserService {

	private List<User>  user = new ArrayList<User>();
	
	public List<User> getAllUser(){
		return user;
	}
	public void addUser(User u) {
		user.add(u);
	}
}
