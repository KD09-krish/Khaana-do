package com.springboot.microservice.foodsite.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="offers")
public class Offers {

	@Field("offer_code")
	private int offerCode;
	
	@Field("offer_name")
	private String offerName;
	
	@Field("description")
	private String description;
	
	@Field("offer_discount")
	private float offerDiscount;
	
	@Field("is_active")
	private boolean isActive;
	
	public Offers() {
		// TODO Auto-generated constructor stub
	}

	public Offers(int offerCode, String offerName, String description, float offerDiscount, boolean isActive) {
		super();
		this.offerCode = offerCode;
		this.offerName = offerName;
		this.description = description;
		this.offerDiscount = offerDiscount;
		this.isActive = isActive;
	}

	public int getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(int offerCode) {
		this.offerCode = offerCode;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getOfferDiscount() {
		return offerDiscount;
	}

	public void setOfferDiscount(float offerDiscount) {
		this.offerDiscount = offerDiscount;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

}
