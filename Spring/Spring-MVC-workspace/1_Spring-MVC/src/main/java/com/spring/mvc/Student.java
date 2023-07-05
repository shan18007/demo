package com.spring.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favLanguage;
	private String[] operatingSystems;

	public Student() {

		this.countryOptions = new LinkedHashMap<String, String>();
		this.countryOptions.put("BRZ", "Brazil");
		this.countryOptions.put("IND", "India");
		this.countryOptions.put("GER", "Germany");
		this.countryOptions.put("TRK", "Turkey");

	}

	public Student(String firstName, String lastName, LinkedHashMap<String, String> countryOptions) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.countryOptions = countryOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return this.countryOptions;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", countryOptions=" + countryOptions
				+ "]";
	}

}
