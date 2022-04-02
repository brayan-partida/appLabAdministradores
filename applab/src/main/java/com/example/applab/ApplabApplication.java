package com.example.applab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.applab.DTO.userDtos;
import com.example.applab.repository.userDataRepository;
import com.example.applab.repository.userRepository;



@SpringBootApplication
@EnableJpaRepositories

public class ApplabApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplabApplication.class, args);
	}

}
