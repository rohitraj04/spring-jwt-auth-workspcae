package com.security;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.security.model.User;
import com.security.repository.UserRepository;

@SpringBootApplication
public class SpringJwtAuthApplication {

	@Autowired
	UserRepository userRepository;

	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(new User((long) 11102, "JwtM", "password", "javaM@gmail.com"),
				new User((long) 11103, "user1", "pass1", "javaM@gmail.com")).collect(Collectors.toList());
		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtAuthApplication.class, args);
	}

}
