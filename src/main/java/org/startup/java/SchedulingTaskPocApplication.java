package org.startup.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingTaskPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTaskPocApplication.class, args);
	}

}
