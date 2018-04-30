package com.mogalli.jspjstldemo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity.HeadersBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mogalli.jspjstldemo.model.Automate;
import com.mogalli.jspjstldemo.model.Automation_build;
import com.mogalli.jspjstldemo.model.Automation_session;

import com.mogalli.jspjstldemo.model.Projects;

@Service
@SuppressWarnings("unused")
public class ProjectService {

	@Autowired
	private RestTemplateBuilder restTemplate;
	@Autowired
	private RestService restService;

	public List<Projects> getAllProjects() {

		ResponseEntity<Projects[]> pr = restTemplate.build().exchange(
				"https://api.browserstack.com/automate/projects.json", HttpMethod.GET, restService.getRequest(),
				Projects[].class);
		return Arrays.asList(pr.getBody());

	}

	public Projects getOneProject(int projectID) {

		ResponseEntity<Automate> pr = restTemplate.build().exchange(
				"https://api.browserstack.com/automate/projects/{id}.json", HttpMethod.GET, restService.getRequest(),
				Automate.class, projectID);
		return pr.getBody().getProject();
	}

	public List<Automation_build> getAllBuilds() {

		List<Automation_build> builds = new ArrayList<Automation_build>();
		ResponseEntity<Automate[]> pr = restTemplate.build().exchange(
				"https://api.browserstack.com/automate/builds.json", HttpMethod.GET, restService.getRequest(),
				Automate[].class);
		for (Automate browserstack : pr.getBody()) {

			builds.add(browserstack.getAutomation_build());
		}
		return builds;
	}

	public List<Automation_session> getAllSessions(String id) {

		List<Automation_session> sessions = new ArrayList<Automation_session>();
		String url = "https://api.browserstack.com/automate/builds/" + id + "/sessions.json";
		ResponseEntity<Automate[]> pr = restTemplate.build().exchange(
				"https://api.browserstack.com/automate/builds/{id}/sessions.json", HttpMethod.GET,
				restService.getRequest(), Automate[].class, id);
		for (Automate browserstack : pr.getBody()) {
			sessions.add(browserstack.getAutomation_sessions());
		}
		return sessions;

	}

}
