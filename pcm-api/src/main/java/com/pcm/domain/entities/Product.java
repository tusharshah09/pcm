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

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "product")
public class Product  {
		@Id
		@Column(name = "id")
	    private int id;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "description")
		private String description;
		
		@Column(name = "url")
		private String url;
		
		@Column(name = "is_active")
		private Boolean isActive ;
		
		@Column(name = "is_new")
		private Boolean isNew;
		
		@ManyToMany
		@JoinTable(
		  name = "product_sku", 
		  joinColumns = @JoinColumn(name = "product_id"), 
		  inverseJoinColumns = @JoinColumn(name = "sku_id"))
		Set<Sku> skus;
		
		@Column(name = "retail_price")
		private String retailPrice;
		
		@Column(name = "sale_price")
		private String salePrice;
		
		@Column(name = "discount")
		private String discount;
		
		
		  @JsonIgnore
		  
		  @Column(name = "currency_id") private Integer currencyId;
		 
		
		@OneToOne()
		@JoinColumn(name = "currency_id", insertable = false, updatable = false) 
		private Currency currency;
		
		
		@OneToOne()
		@JoinColumn(name = "category_id") 
		private Category category;
		
		
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
		
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}

		public Set<Sku> getSkus() {
			return skus;
		}
		public void setSkus(Set<Sku> skus) {
			this.skus = skus;
		}
		public Currency getCurrency() {
			return currency;
		}
		public void setCurrency(Currency currency) {
			this.currency = currency;
		}
		
		  public Integer getCurrencyId() { return currencyId; } public void
		  setCurrencyId(Integer currencyId) { this.currencyId = currencyId; }
		 
		
		 
		
		
		
}
