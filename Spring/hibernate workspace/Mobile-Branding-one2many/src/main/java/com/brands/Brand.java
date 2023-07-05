package com.brands;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Brand {

	@Id
	private int brandId;
	private String brandName;
	@OneToMany(mappedBy = "brand",cascade = CascadeType.ALL)
	List<Models> models;

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(int brandId, String brandName, List<Models> models) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.models = models;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<Models> getModels() {
		return models;
	}

	public void setModels(List<Models> models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", models=" + models + "]";
	}

}
