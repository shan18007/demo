package com.brands;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Models {
	@Id
	private int modelId;
	private String modelName;
	@ManyToOne
	private Brand brand;

	public Models() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Models(int modelId, String modelName, Brand brand) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.brand = brand;
	}

	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}
