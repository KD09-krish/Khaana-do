package com.springboot.microservice.foodsite.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.microservice.foodsite.entity.Menu;

public interface MenuDAO extends MongoRepository<Menu,String> {

}
