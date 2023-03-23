package com.genspark.springboot_maven_jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SpringbootMavenJenkinsApplicationTests {
	public static final Logger logger = LoggerFactory.getLogger(SpringbootMavenJenkinsApplication.class);
	@Test
	void contextLoads() {
		logger.info(" CI test");
		Assert.isTrue(true, String.valueOf(true));
	}

}
