package com.practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ForeignKey;

import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int pId;
	@Column(name = "product_price")
	private int pPrice;
	@Column(name = "product_quantity")
	private int pQuantity;
	@Column(name = "product_name")
	private String pName;
	@Column(name = "product_discount")
	private int pDiscount;
	@Column(name = "product_des")
	private String pDesc;
	private String pPhoto;
	@ManyToOne
	@JoinColumn(name = "c_id")
	@ForeignKey(name = "FK_REF_CATEGORY")
	Category category;

}
