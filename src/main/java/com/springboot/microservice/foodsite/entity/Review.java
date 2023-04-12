package com.springboot.microservice.foodsite.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="review")
public class Review {

	@Id
	private String id;
	
	@Field("rating")
	private double rating;
	
	@Field("review")
	private String review;
	
	@Field("by")
	private User by;
	
	@Field("added_on")
	private Date addedOn;
	
	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(double rating, String review, User by, Date addedOn) {
		super();
		this.rating = rating;
		this.review = review;
		this.by = by;
		this.addedOn = addedOn;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public User getBy() {
		return by;
	}

	public void setBy(User by) {
		this.by = by;
	}

	public Date getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}
	
	

}
