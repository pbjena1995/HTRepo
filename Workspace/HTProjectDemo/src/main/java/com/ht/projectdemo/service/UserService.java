package com.ht.projectdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.projectdemo.entity.User;
import com.ht.projectdemo.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	public void saveUser(User user) {
		userRepo.save(user);	
	}

}
