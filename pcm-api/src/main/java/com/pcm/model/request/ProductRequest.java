package com.pcm.model.request;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRequest  {
	    private int id;
		private String name;
		private String description;
		private String url;
		private Boolean isActive;
		private Boolean isNew;
		
		private String retailPrice;
		private String salePrice;
		private String discount;
		
		private Integer currencyId;
		private Integer categoryId;
		
		
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
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
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
		public Integer getCurrencyId() {
			return currencyId;
		}
		public void setCurrencyId(Integer currencyId) {
			this.currencyId = currencyId;
		}
		public Integer getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(Integer categoryId) {
			this.categoryId = categoryId;
		}
		
	
		
		
		
}
