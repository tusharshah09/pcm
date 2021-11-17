package com.pcm.domain.entities;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "sku")
public class Sku {
	@Id
	private int id;
	private String name;
	private String description;
	
	@Column(name="short_description")
	private String shortDescription;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="retail_price")
	private String retailPrice;
	
	@Column(name="sale_price")
	private String salePrice;
	
	@Column(name="base_price_unit")
	private String basePriceUnit;
	
	@Column(name="discount")
	private String discount;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="is_available")
	private Boolean isAvailable;
	
	@Column(name="inventory_type")
	private String inventoryType;
	
	@Column(name="ww_Sku")
	private String wwSku;
	
	@Column(name="product_type")
	private String productType;
	
	@Column(name="quantity_available")
	private Integer quantityAvailable;
	
	@Column(name="is_subscription")
	private Boolean isSubscription;
	
	@Column(name="tax_code")
	private String taxCode;
	
	@OneToOne 
	@JoinColumn(name = "fulfillment_type_id", insertable = false, updatable = false)
	private FulfillmentType fulfillmentType;
	
	@ManyToMany
	@JoinTable(
	  name = "sku_media", 
	  joinColumns = @JoinColumn(name = "sku_id"), 
	  inverseJoinColumns = @JoinColumn(name = "media_id"))
	Set<Media> media;
	
	/*
	 * @Column(name="fulfillmentType") private FulfillmentType fulfillment_type;
	 */
	
	/*
	 * @Column(name="media") private List<Media> media;
	 */

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

	
	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

		public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
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

	public String getBasePriceUnit() {
		return basePriceUnit;
	}

	public void setBasePriceUnit(String basePriceUnit) {
		this.basePriceUnit = basePriceUnit;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getWwSku() {
		return wwSku;
	}

	public void setWwSku(String wwSku) {
		this.wwSku = wwSku;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Integer getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(Integer quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public Boolean getIsSubscription() {
		return isSubscription;
	}

	public void setIsSubscription(Boolean isSubscription) {
		this.isSubscription = isSubscription;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}



	private Integer fulfillment_type_id;

	/*
	 * public Integer getFulfillment_type_id() { return fulfillment_type_id; }
	 * 
	 * public void setFulfillment_type_id(Integer fulfillment_type_id) {
	 * this.fulfillment_type_id = fulfillment_type_id; }
	 */
	
	/*
	 * @OneToOne()
	 * 
	 * @JoinColumn(name = "fulfillment_type_id", insertable = false, updatable =
	 * false) private FulfillmentType fulfillmentType;
	 * 
	 * public FulfillmentType getFulfillmentType() { return fulfillmentType; }
	 * 
	 * public void setFulfillmentType(FulfillmentType fulfillmentType) {
	 * this.fulfillmentType = fulfillmentType; }
	 */
	
	/*
	 * @OneToOne()
	 * 
	 * @JoinColumn(name = "fulfillment_type_id", insertable = false, updatable =
	 * false)
	 * 
	 * @JsonInclude(Include.NON_NULL) private FulfillmentType fulfillmentType;
	 * 
	 * public FulfillmentType getFulfillmentType() { return fulfillmentType; }
	 * 
	 * public void setFulfillmentType(FulfillmentType fulfillmentType) {
	 * this.fulfillmentType = fulfillmentType; }
	 */
	 
	/*
	 * public FulfillmentType getFulfillment_type() { return fulfillment_type; }
	 * 
	 * public void setFulfillment_type(FulfillmentType fulfillment_type) {
	 * this.fulfillment_type = fulfillment_type; }
	 */

	/*
	 * public List<Media> getMedia() { return media; }
	 * 
	 * public void setMedia(List<Media> media) { this.media = media; }
	 */
	
	

	public FulfillmentType getFulfillmentType() {
		return fulfillmentType;
	}

	public void setFulfillmentType(FulfillmentType fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}

	public Set<Media> getMedia() {
		return media;
	}

	public void setMedia(Set<Media> media) {
		this.media = media;
	}

	
	
	
	/* @ManyToMany Set<Product> products; */

		/*
		 * public Set<Product> getProducts() { return products; }
		 * 
		 * public void setProducts(Set<Product> products) { this.products = products; }
		 */
	  
	 
	
	
	
	
}
