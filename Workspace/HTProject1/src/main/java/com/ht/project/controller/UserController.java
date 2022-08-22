package com.ht.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ht.project.UserEntity.User;
import com.ht.project.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("UserController")
@Slf4j
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getuser")
	public String getUser() {
		return "Priyabrat Jena";
	}
	
	
	@PostMapping("/saveuser")
	public String saveUser(@RequestBody User user) {
		
		userService.saveUser(user);
		return user.getName();
	}
	

}
