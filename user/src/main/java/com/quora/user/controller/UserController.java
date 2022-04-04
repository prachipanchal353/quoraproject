/**
 * 
 */
package com.quora.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quora.user.entity.User;
import com.quora.user.service.UserService;

/**
 * @author satishkumar07
 *
 */
@RestController
@RequestMapping("user/")
public class UserController {

	
	@Autowired
	UserService userService ;


	@PostMapping
	public int createUser(User user) {
		return userService.createUser(user);
	}

	@GetMapping
	public User getUser(int id) {
		return userService.getUser(id);
	}


	

}
