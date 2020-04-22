package com.tyss.ecart.dao;

import java.util.List;

import com.tyss.ecart.model.User;

public interface UserDao {

	List<User> getAllUsers();

	void deleteUser(String userId);
	
	void addUser(User user);
	
	User getUserById(String userId);
}
