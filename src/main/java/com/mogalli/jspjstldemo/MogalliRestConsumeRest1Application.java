package com.mogalli.jspjstldemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.mogalli.jspjstldemo.model.Projects;

@SpringBootApplication
@SuppressWarnings("all")
public class MogalliRestConsumeRest1Application {

	public static void main(String[] args) {
		SpringApplication.run(MogalliRestConsumeRest1Application.class, args);

	}

}
