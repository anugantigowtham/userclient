package com.users.client.resttemplate;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.users.client.config.Constants;
import com.users.client.pojo.User;
import com.users.client.pojo.UserProfile;
import com.users.client.pojo.UserResponse;
import com.users.client.util.JsonParser;

public class RestClient {

	private JsonParser jsonParser = new JsonParser();

	private RestTemplate restTemplate = RestTemplateConfigurator.getRestTemplate();

	public User getAllUsers() throws RestClientException, URISyntaxException {
		return restTemplate.postForObject(new URI(Constants.BaseURL + Constants.ALL_USERS), null, User.class);
	}

	public UserResponse addUser(Object requestObj) throws RestClientException, URISyntaxException {
		String json = null;
		try {
			json = jsonParser.convertObjectToJson(requestObj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (json != null) {
			return restTemplate.postForObject(new URI(Constants.BaseURL + Constants.ADD_USER), json,
					UserResponse.class);
		}
		return null;
	}
	
	public User getUser(Object reqObj) throws RestClientException, URISyntaxException {
		String json = null;
		try {
			json = jsonParser.convertObjectToJson(reqObj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (json != null) {
			return restTemplate.postForObject(new URI(Constants.BaseURL + Constants.USER_DATA), json, User.class);
		}
		return null;
	}

	public UserResponse removeUser(Object reqObj) throws RestClientException, URISyntaxException {
		String json = null;
		try {
			json = jsonParser.convertObjectToJson(reqObj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (json != null) {
			return restTemplate.postForObject(new URI(Constants.BaseURL + Constants.REMOVE_USER), json, UserResponse.class);
		}
		return null;
	}

	public UserResponse searchUser(Object reqObj) throws RestClientException, URISyntaxException {
		String json = null;
		try {
			json = jsonParser.convertObjectToJson(reqObj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (json != null) {
			return restTemplate.postForObject(new URI(Constants.BaseURL + Constants.SEARCH_USERS), json, UserResponse.class);
		}
		return null;
	}

	public UserResponse getUserDataByUser(Object reqObj) throws RestClientException, URISyntaxException {
		String json = null;
		try {
			json = jsonParser.convertObjectToJson(reqObj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (json != null) {
			return restTemplate.postForObject(new URI(Constants.BaseURL + Constants.GET_USER_DATA), json, UserResponse.class);
		}
		return null;
	}

	// need to work on this
	public UserResponse deleteUser(Object reqObj) throws RestClientException, URISyntaxException {
		String json = null;
		try {
			json = jsonParser.convertObjectToJson(reqObj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (json != null) {
			return restTemplate.postForObject(new URI(Constants.BaseURL + Constants.DELETE_USER_ID), json, UserResponse.class);
		}
		return null;
	}

	public UserProfile getUserProfile() throws RestClientException, URISyntaxException {
		return restTemplate.getForObject(new URI(Constants.BaseURL + Constants.USER_PROFILE), UserProfile.class);
	}

}
