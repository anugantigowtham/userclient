package com.users.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

/**
 * 
 * @author Gowtham.anuganti
 *
 */
@Configuration
@ComponentScan({ "com.users.client"})
@PropertySource("file:config/users.properties")
public class SMSAplicationConfiguration {

	@Bean(name = "gson")
	public Gson getGson() {
		return new Gson();
	}

	@Bean(name = "objectMapper")
	public ObjectMapper getObjectMapper(){
		return new ObjectMapper();
	}
	
	@Bean(name="restTemplate")
	public RestTemplate getRestTemplate(){
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		return restTemplate;
	}
}
