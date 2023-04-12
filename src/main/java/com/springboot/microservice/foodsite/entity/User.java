package com.springboot.microservice.foodsite.entity;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="users")
public class User {

	@Id
	private String id;
	
	@Field("email")
	private String email;
	
	@Field("username")
	private String username;
	
	@Field("gender")
	private String gender;
	
	@Field("delivery_address")
	private String deliveryAddress;
	
	@Field("ph_No")
	private int phNo;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String email, String username, String gender, String deliveryAddress, int phNo) {
		super();
		this.email = email;
		this.username = username;
		this.gender = gender;
		this.deliveryAddress = deliveryAddress;
		this.phNo = phNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public int getPhNo() {
		return phNo;
	}

	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

	
}
