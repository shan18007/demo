package com.practice;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private int categoryId;
	@Column(name = "category_title")
	private String categoryTitle;
	@Column(name = "category_description")
	private String categoryDescription;
	@OneToMany(mappedBy = "category")
	private List<Product> products;
}
