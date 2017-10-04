package com.users.client;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.users.client.pojo.User;

/**
 * 
 * @author Gowtham.anuganti
 *
 */
public class AppConfig {
	
	public static void main(String[] args) throws InterruptedException {
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		User postForObject = restTemplate.postForObject("http://13.54.148.72:44001/UserManagement/Contact/AllUsers", null,User.class);
		System.out.println(postForObject);
	}
}
