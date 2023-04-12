package com.springboot.microservice.foodsite.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="foodItems")
public class FoodItem {

	@Field("item_name")
	private String itemName;
	
	@Field("quantity")
	private int quantity;
	
	@Field("price")
	private float price;
	
	// addToppings
	
	public FoodItem() {
		// TODO Auto-generated constructor stub
	}

}
