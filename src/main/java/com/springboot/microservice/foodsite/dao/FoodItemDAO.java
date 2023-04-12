package com.springboot.microservice.foodsite.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.microservice.foodsite.entity.FoodItem;

public interface FoodItemDAO extends MongoRepository<FoodItem,String>{

}
