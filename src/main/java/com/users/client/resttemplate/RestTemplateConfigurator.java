package com.users.client.resttemplate;

import org.springframework.web.client.RestTemplate;

public class RestTemplateConfigurator {

	private final static RestTemplate restTemplate=null;
	
	public  static RestTemplate getRestTemplate(){
		if(restTemplate!=null){
			return restTemplate;
		}else{
			return new RestTemplate();
		}
	}
}
