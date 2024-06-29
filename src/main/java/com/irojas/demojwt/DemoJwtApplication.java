package com.irojas.demojwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"auth", "user", "jwt", "config", "demo"}) 
@EnableJpaRepositories(basePackages = {"user"})
@EntityScan(basePackages = {"user"})
public class DemoJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJwtApplication.class, args);
	}

}
