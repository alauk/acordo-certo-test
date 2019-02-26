package br.com.acordocerto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"br.com.domain.acordocerto.repository"})
@EntityScan(basePackages = {"br.com.domain.acordocerto.entity"})
@ComponentScan(basePackages = { "br.com.service.acordocerto", "br.com.domain.acordocerto", "br.com.acordocerto"})
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
