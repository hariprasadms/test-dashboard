package com.mogalli.jspjstldemo.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class RestService {
	
	private HttpHeaders headers;
	private HttpEntity<String> request ;

	public RestService (RestTemplateBuilder restTemplate ) {
		
		headers = new HttpHeaders();
		headers.add("Authorization", "<Basic Authorization>");
		request = new HttpEntity<String>(headers);	
	}

	public HttpEntity<String> getRequest() {
		return request;
	}

	public void setRequest(HttpEntity<String> request) {
		this.request = request;
	}


}
