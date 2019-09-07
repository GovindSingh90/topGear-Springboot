package com.wipro.registeruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.registeruser.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	

}
