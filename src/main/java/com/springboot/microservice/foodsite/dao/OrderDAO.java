package com.springboot.microservice.foodsite.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.microservice.foodsite.entity.Order;

public interface OrderDAO extends MongoRepository<Order,String> {

}
