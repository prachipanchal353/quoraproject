package com.quora.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quora.user.dao.UserDao;
import com.quora.user.entity.User;

/**
 * @author satishkumar07
 *
 */
@Service
public class UserService {
	
	@Autowired
	UserDao userDao ;


	public int createUser(User user) {
		return userDao.createUser(user);
	}

	public User getUser(int id) {
		return userDao.getUser(id);
	}

}
