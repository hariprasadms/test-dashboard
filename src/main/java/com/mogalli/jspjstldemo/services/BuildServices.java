package com.mogalli.jspjstldemo.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mogalli.jspjstldemo.model.Automation_build;

@Service
public class BuildServices {

	@Autowired
	private RestTemplateBuilder restTemplate;
	private String username = "hariprasad.srinivas@prudential.co.uk";
	private String password = "Kuldubond007";

	public List<Automation_build> getAllBuilds() {

		ResponseEntity<Automation_build[]> abuilds = restTemplate.basicAuthorization(username, password).build()
				.getForEntity("https://api.browserstack.com/automate/builds.json", Automation_build[].class);

		return Arrays.asList(abuilds.getBody());

	}

}
