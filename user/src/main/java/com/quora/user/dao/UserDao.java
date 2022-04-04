package com.quora.user.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.quora.user.entity.User;

/**
 * @author satishkumar07
 *
 */
@Repository
public class UserDao {

	List<User> lst = new ArrayList<User>();
	int i = -1;

	public int createUser(User user) {
		user.setId(++i);
		lst.add(user);
		return user.getId();
	}

	public User getUser(int id) {
		return lst.get(id);
	}
}
