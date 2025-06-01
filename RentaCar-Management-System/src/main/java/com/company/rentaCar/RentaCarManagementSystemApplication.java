package com.company.rentaCar;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RentaCarManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentaCarManagementSystemApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Rent Car System Docs")
						.version("1")
						.description("This document designed for RCM System")
						.termsOfService("http://swagger.io/terms/")
						.contact(new Contact()
								.name("Bobur")
								.email("boburtoshniyozov4y@gmail.com")
								.url("https://github.com/boburcoders/rent-cat-system"))
						.license(new License()
								.name("Apache 2")
								.url("springdoc.org"))
				)
				.externalDocs(new ExternalDocumentation()
						.description("RCM System version 1"))
				.servers(List.of(
						new Server().url("http://192.168.255.105:8080").description("Test Server with CI/CD "),
						new Server().url("http://localhost:8080").description("LocalHost Server")
				))
				/*.addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
				.components(new Components()
						.addSecuritySchemes("bearerAuth", new SecurityScheme()
								.name("bearerAuth")
								.type(SecurityScheme.Type.HTTP)
								.scheme("bearer")
								.bearerFormat("JWT")))*/;
	}
}
