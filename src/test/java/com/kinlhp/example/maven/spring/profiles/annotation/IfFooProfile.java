package com.kinlhp.example.maven.spring.profiles.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.test.context.junit.jupiter.EnabledIf;

import static com.kinlhp.example.maven.spring.profiles.annotation.IfFooProfile.EXPRESSION;

@EnabledIf(expression = EXPRESSION)
@Inherited
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE, ElementType.METHOD})
public @interface IfFooProfile {

	String EXPRESSION = "#{environment.acceptsProfiles(T(org.springframework.core.env.Profiles).of('foo'))}";
}
