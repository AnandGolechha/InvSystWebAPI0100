package com.gensoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class InventorySystemWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorySystemWebApiApplication.class, args);
	}
}
