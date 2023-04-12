package com.springboot.microservice.foodsite.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.microservice.foodsite.entity.User;

public interface UserDAO extends MongoRepository<User,String> {

}
