package com.users.client.service;

import com.users.client.pojo.User;
import com.users.client.pojo.UserResponse;

public interface UserService {

	public User getAllUsers();
	
	public UserResponse createUser(Object reqObj);
}
