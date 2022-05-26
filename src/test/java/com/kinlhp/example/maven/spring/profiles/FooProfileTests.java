package com.kinlhp.example.maven.spring.profiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.kinlhp.example.maven.spring.profiles.annotation.IfFooProfile;

@IfFooProfile
@SpringBootTest
class FooProfileTests {

	@Value(value = "${spring.application.name}")
	private String springApplicationName;

	@Value(value = "${foo.value}")
	private String fooValue;

	@Test
	void assertProperties() {
		Assertions.assertAll(
				() -> Assertions.assertEquals("maven-spring-profiles-integration", springApplicationName),
				() -> Assertions.assertEquals("foo", fooValue)
		);
	}
}
