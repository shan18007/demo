package com.mvc;

import java.util.Arrays;
import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

public class Student {

	@NotNull(message = "name is required")
	@Size(min = 1,message = "name is required")
	private String fName;
	private String lName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String[] operatingSystems;

	Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BRZ", "Brazil");
		countryOptions.put("IND", "India");
		countryOptions.put("GER", "Germany");
	}

	public Student(String fName, String lName, String country, String[] operatingSystems) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.country = country;
		this.operatingSystems = operatingSystems;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	@Override
	public String toString() {
		return "Student [fName=" + fName + ", lName=" + lName + ", country=" + country + ", countryOptions="
				+ countryOptions + ", operatingSystems=" + Arrays.toString(operatingSystems) + "]";
	}

}
