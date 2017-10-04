package com.users.client.service.impl;

import java.net.URISyntaxException;

import org.springframework.web.client.RestClientException;

import com.users.client.pojo.User;
import com.users.client.pojo.UserProfile;
import com.users.client.pojo.UserResponse;
import com.users.client.resttemplate.RestClient;
import com.users.client.service.UserService;

public class UserServiceImpl implements UserService {

	private RestClient rc = new RestClient();

	// api 1
	@Override
	public User getAllUsers() {
		User allUsers = null;
		try {
			allUsers = rc.getAllUsers();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return allUsers;
	}

	// api 3
	@Override
	public UserResponse createUser(Object requestObject) {
		UserResponse addUser = null;
		try {
			addUser = rc.addUser(requestObject);
		} catch (RestClientException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return addUser;
	}

	// api 2
	public User getUserData(Object reqObj) {
		User user = null;
		try {
			user = rc.getUser(reqObj);
		} catch (RestClientException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return user;
	}

	// api 4
	public UserResponse removeUser(Object reqObj) {
		UserResponse userResponse = null;
		try {
			userResponse = rc.removeUser(reqObj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userResponse;
	}

	// api 5
	public UserResponse searchUser(Object reqObj) {
		UserResponse userResponse = null;
		try {
			userResponse = rc.searchUser(reqObj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userResponse;
	}

	// api 6
	public UserResponse getUserDataByUser(Object reqObj) {
		UserResponse userResponse = null;
		try {
			userResponse = rc.getUserDataByUser(reqObj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userResponse;
	}
	
	//api 7 work pending on this
	public UserResponse deleteUser(Object reqObj){
		UserResponse userResponse = null;
		try {
			userResponse = rc.deleteUser(reqObj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userResponse;
	}
	
	//api 8
	public UserProfile getUserProfile() {
		UserProfile userProfile = null;
		try {
			userProfile = rc.getUserProfile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userProfile;
	}
}
