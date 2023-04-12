package com.springboot.microservice.foodsite.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="restaurant")
public class Restaurant {

	@Field("Id")
	private String Id;
	
	@Field("rating")
	private float rating;
	
	@Field("address")
	private String address;
	
	@Field("name")
	private String name;
	
	@Field("reviews")
	private Review reviews;
	
	@Field("menu")
	private Menu menu;
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(float rating, String address, String name, Review reviews, Menu menu) {
		super();
		this.rating = rating;
		this.address = address;
		this.name = name;
		this.reviews = reviews;
		this.menu = menu;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Review getReviews() {
		return reviews;
	}

	public void setReviews(Review reviews) {
		this.reviews = reviews;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	
}
