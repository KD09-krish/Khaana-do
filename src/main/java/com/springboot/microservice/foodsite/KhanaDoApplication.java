package com.springboot.microservice.foodsite;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.springboot.microservice.foodsite.dao.ReviewDAO;
import com.springboot.microservice.foodsite.entity.Review;
import com.springboot.microservice.foodsite.entity.User;

@SpringBootApplication
@EnableMongoRepositories
public class KhanaDoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(KhanaDoApplication.class, args);
	}

	@Autowired
	ReviewDAO dao;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Review review = new Review(4.5, "sample review",new User(), new Date());
	//	review = dao.save(review);
		System.out.println(review);
		
	}

	
}
