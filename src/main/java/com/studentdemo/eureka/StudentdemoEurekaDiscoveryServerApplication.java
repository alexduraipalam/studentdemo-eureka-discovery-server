package com.studentdemo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentdemoEurekaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentdemoEurekaDiscoveryServerApplication.class, args);
	}

}
