package com.dev.taskmanager_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TaskmanagerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagerApiApplication.class, args);
	}

}
