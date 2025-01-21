package com.myspring.practiceApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PracticeAppApplication {

	public static void main(String[] args) {
//		IOC container is of type "ApplicationContext"
		ApplicationContext context = SpringApplication.run(PracticeAppApplication.class, args);

		Dev someDev = context.getBean(Dev.class);
		someDev.build();
	}
}
