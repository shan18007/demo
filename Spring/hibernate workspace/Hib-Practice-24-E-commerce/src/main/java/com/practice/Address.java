package com.practice;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Address extends AbstractEntity{

	@Column(length = 60)
	private String street;
	private String city;
	private String state;
	@Column(length = 6)
	private int pin;
}
