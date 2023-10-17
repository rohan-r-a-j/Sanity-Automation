package com.sanity.automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestCadentSanityAutomaionApplication {

	public static void main(String[] args) {
		SpringApplication.from(CadentSanityAutomaionApplication::main).with(TestCadentSanityAutomaionApplication.class).run(args);
	}

}
