package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoProjectApplication {

	public static void main(String[] args) {
		System.out.println("This is git project");
		SpringApplication.run(GitDemoProjectApplication.class, args);
	}

}
