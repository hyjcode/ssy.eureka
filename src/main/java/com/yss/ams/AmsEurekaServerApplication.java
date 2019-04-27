package com.yss.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AmsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmsEurekaServerApplication.class, args);
	}
}
