package com.corona.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Corona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String city;
	private int patitents;

	public Corona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Corona(long id, String city, int patitents) {
		super();
		this.id = id;
		this.city = city;
		this.patitents = patitents;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPatitents() {
		return patitents;
	}

	public void setPatitents(int patitents) {
		this.patitents = patitents;
	}

	@Override
	public String toString() {
		return "Corona [id=" + id + ", city=" + city + ", patitents=" + patitents + "]";
	}

}
