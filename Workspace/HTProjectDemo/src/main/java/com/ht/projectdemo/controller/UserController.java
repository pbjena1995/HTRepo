package com.ht.projectdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ht.projectdemo.entity.User;
import com.ht.projectdemo.service.UserService;

@RestController
@RequestMapping("/usercontropller")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getuser")
	public String getUser() {
		return "Priyabrat Jena";
	}
	
	
	@PostMapping("/save/user")
	public List<User> saveUser(@RequestBody User user) {
		List<User> list=new ArrayList();
		userService.saveUser(user);
		list.add(user);
		return list;
	}

}
