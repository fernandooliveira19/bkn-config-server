package com.fernando.oliveira.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BknConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BknConfigServerApplication.class, args);
	}

}
