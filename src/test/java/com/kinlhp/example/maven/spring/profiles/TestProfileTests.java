package com.kinlhp.example.maven.spring.profiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.kinlhp.example.maven.spring.profiles.annotation.IfTestProfile;

@IfTestProfile
@SpringBootTest
class TestProfileTests {

	@Value(value = "${spring.application.name}")
	private String springApplicationName;

	@Value(value = "${test.value}")
	private String testValue;

	@Test
	void assertProperties() {
		Assertions.assertAll(
				() -> Assertions.assertEquals("maven-spring-profiles-integration", springApplicationName),
				() -> Assertions.assertEquals("test", testValue)
		);
	}
}
