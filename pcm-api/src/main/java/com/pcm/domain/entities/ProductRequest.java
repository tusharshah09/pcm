package com.pcm.domain.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


public class ProductRequest {
	
	
    private int id;
	
	
	private String name;
	
	
	private String description;
	
	
	private String url;
	
	
	private Boolean isActive ;
	

	private Boolean isNew;
	
	
	private String retailPrice;
	
	
	private String salePrice;
	

	private String discount;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public Boolean getIsNew() {
		return isNew;
	}


	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}


	public String getRetailPrice() {
		return retailPrice;
	}


	public void setRetailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}


	public String getSalePrice() {
		return salePrice;
	}


	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}


	public String getDiscount() {
		return discount;
	}


	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	
	
}
