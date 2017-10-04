package com.users.client.util;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;

/**
 * 
 * @author Gowtham.anuganti
 *
 */
@Component("jsonParser")
public class JsonParser {
	
	public String convertObjectToJson(Object requestObj) {
		Gson gson =new Gson();
		return gson.toJson(requestObj);
	}
}
