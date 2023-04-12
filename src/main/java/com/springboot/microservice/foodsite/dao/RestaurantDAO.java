package com.springboot.microservice.foodsite.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.microservice.foodsite.entity.Restaurant;

public interface RestaurantDAO extends MongoRepository<Restaurant, String> {

}
