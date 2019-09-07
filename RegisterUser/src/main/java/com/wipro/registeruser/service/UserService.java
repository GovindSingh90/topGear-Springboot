package com.wipro.registeruser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.registeruser.entity.User;
import com.wipro.registeruser.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public void save(User user) {
       userRepository.save(user);
    }
	public List<User> listAll() {
        return userRepository.findAll();
    }
	
	 public User get(int id) {
	        return userRepository.findById(id).get();
	    }
	     
	    public void delete(int id) {
	    	userRepository.deleteById(id);
	    }
}
