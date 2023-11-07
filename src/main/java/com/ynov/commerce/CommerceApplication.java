package com.ynov.commerce;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Ynov API", version = "3.0", description = "Ynov Information"))
public class CommerceApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(CommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
