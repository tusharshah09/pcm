package com.pcm.domain.entities;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "category")
public class Category {
	@Id
	private int id;
	
	private String name;
	
	@Column(name="Active") 
	@JsonInclude(Include.NON_NULL)
	private Boolean active;
	  
	@Column(name="is_featured") 
	@JsonInclude(Include.NON_NULL)
	private Boolean isFeatured;
	  
	@Column(name="navigation_included") 
	@JsonInclude(Include.NON_NULL)
	private Boolean navigationIncluded;
	 
	private String url;
	
	@Column(name = "url_key") 
	@JsonInclude(Include.NON_NULL)
	private String urlKey;
	
	
	@OneToOne()
	@JoinColumn(name = "parent_id", insertable = false, updatable = false) 
	@JsonInclude(Include.NON_NULL)
	private Category parent;
	 
	
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
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	public Boolean getIsFeatured() {
		return isFeatured;
	}
	public void setIsFeatured(Boolean isFeatured) {
		this.isFeatured = isFeatured;
	}
	public Boolean getNavigationIncluded() {
		return navigationIncluded;
	}
	public void setNavigationIncluded(Boolean navigationIncluded) {
		this.navigationIncluded = navigationIncluded;
	}
	public String getUrlKey() {
		return urlKey;
	}
	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}
	public Category getParent() {
		return parent;
	}
	public void setParent(Category parent) {
		this.parent = parent;
	}
	
	
	
}
