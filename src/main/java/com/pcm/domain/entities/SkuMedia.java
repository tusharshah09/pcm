package com.pcm.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sku_media")
public class SkuMedia {

	@Id
	private Integer id;
	
	private Integer	sku_id;
	
	private Integer meida_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSku_id() {
		return sku_id;
	}

	public void setSku_id(Integer sku_id) {
		this.sku_id = sku_id;
	}

	public Integer getMeida_id() {
		return meida_id;
	}

	public void setMeida_id(Integer meida_id) {
		this.meida_id = meida_id;
	}
	
	
}
