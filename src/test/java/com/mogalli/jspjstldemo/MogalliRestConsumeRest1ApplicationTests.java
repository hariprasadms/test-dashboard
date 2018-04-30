package com.mogalli.jspjstldemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.mogalli.jspjstldemo.model.Automate;
import com.mogalli.jspjstldemo.model.Projects;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MogalliRestConsumeRest1ApplicationTests {

	@Autowired
	private RestTemplateBuilder builder;
	private String username = "<browserstack username>";
	private String password = "<Password>";

	// @Test
	public void getProjects() {

		ResponseEntity<Projects[]> pr = builder.basicAuthorization(username, password).build()
				.getForEntity("https://api.browserstack.com/automate/projects.json", Projects[].class);
		for (int i = 0; i < pr.getBody().length; i++) {

			System.out.println(pr.getBody()[i].toString());

		}
	}

	@Test
	public void getProject() {

		ResponseEntity<Automate> pr = builder.basicAuthorization(username, password).build()
				.getForEntity("https://api.browserstack.com/automate/projects/343094.json", Automate.class);

		System.out.println(pr.getBody().toString());

		Automate body = pr.getBody();
		if (body.getAutomation_build() == null) {
			System.out.println("No Builds Associated to this");
		}

	}

	// @Test
	public void getBuilds() {

		ResponseEntity<Automate> pr = builder.basicAuthorization(username, password).build().getForEntity(
				"https://api.browserstack.com/automate/builds/06c1a78ccb0b603f64fdf821622c9890606771c1.json",
				Automate.class);

		System.out.println(pr);

	}

	// @Test
	public void getSessions() {

		ResponseEntity<Automate[]> pr = builder.basicAuthorization(username, password).build().getForEntity(
				"https://api.browserstack.com/automate/builds/06c1a78ccb0b603f64fdf821622c9890606771c1/sessions.json",
				Automate[].class);

		System.out.println(pr);

	}

}
