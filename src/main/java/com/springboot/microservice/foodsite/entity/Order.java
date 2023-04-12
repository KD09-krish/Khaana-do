package com.springboot.microservice.foodsite.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="order")
public class Order {

	@Field("id")
	private String id;
	
	@Field("orders")
	private ArrayList<Order> orders;
	
	@Field("quantity")
	private int quantity;
	
	@Field("user_info")
	private User userInfo;
	
	@Field("date")
	private Date date;
	
	@Field("restaurant")
	private Restaurant restaurant;
	
	@Field("food_items")
	private List<FoodItem> foodItems;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(ArrayList<Order> orders, int quantity, User userInfo, Date date, Restaurant restaurant,
			List<FoodItem> foodItems) {
		super();
		this.orders = orders;
		this.quantity = quantity;
		this.userInfo = userInfo;
		this.date = date;
		this.restaurant = restaurant;
		this.foodItems = foodItems;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public User getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public List<FoodItem> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}
	
	

}
