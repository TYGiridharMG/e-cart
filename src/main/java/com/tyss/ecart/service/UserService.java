package com.tyss.ecart.service;

import java.util.List;

import com.tyss.ecart.model.User;

public interface UserService {

	List<User> getAllUsers();
	
	void deleteUser(String userId);
	
	void addUser(User user);
	
	User getUserById(String userId);
}
