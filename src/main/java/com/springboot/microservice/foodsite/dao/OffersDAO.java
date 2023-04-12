package com.springboot.microservice.foodsite.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.microservice.foodsite.entity.Offers;

public interface OffersDAO extends MongoRepository<Offers,String> {

}
