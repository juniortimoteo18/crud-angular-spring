package com.motto.crudspring;

import com.motto.crudspring.model.Courses;
import com.motto.crudspring.repository.CoursesRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CoursesRepository coursesRepository){
		return args -> {
			coursesRepository.deleteAll();

			Courses c = new Courses();
			c.setName("Angular com Spring");
			c.setCategory("front-end");

			coursesRepository.save(c);
		};
	}

}
