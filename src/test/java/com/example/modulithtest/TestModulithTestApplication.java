package com.example.modulithtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestModulithTestApplication {

	public static void main(String[] args) {
		SpringApplication.from(ModulithTestApplication::main).with(TestModulithTestApplication.class).run(args);
	}

}
