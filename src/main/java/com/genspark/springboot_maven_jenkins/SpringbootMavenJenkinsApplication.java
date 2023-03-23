package com.genspark.springboot_maven_jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMavenJenkinsApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringbootMavenJenkinsApplication.class);
	public static void main(String[] args) {
		logger.info("CI job");
		SpringApplication.run(SpringbootMavenJenkinsApplication.class, args);
	}

}
