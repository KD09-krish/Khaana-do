package com.springboot.microservice.foodsite.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="menu")
public class Menu {

	@Field("menu_name")
	private String menuName;
	
	@Field("food_items")
	private List<FoodItem> foodItems;
	
	@Field("is_active")
	private boolean isActive;
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String menuName, List<FoodItem> foodItems, boolean isActive) {
		super();
		this.menuName = menuName;
		this.foodItems = foodItems;
		this.isActive = isActive;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public List<FoodItem> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
}
