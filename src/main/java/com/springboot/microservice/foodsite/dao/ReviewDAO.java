package com.springboot.microservice.foodsite.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.microservice.foodsite.entity.Review;

public interface ReviewDAO extends MongoRepository<Review,String> {

}
