package com.emp.entity;

public class Employee {
	private int id;
	private String first_name;
	private String last_name;
	private int salary;

	public Employee() {
	}

	public Employee(String fname, String lname, int salary) {
		this.first_name = fname;
		this.last_name = lname;
		this.salary = salary;
	}
}
