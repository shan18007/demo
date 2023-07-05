package com.hib;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.validation.CourseCode;

public class Student {

//	@Size(min = 2, message = "minimum size should be 2 characters")
	@NotNull(message = "first name is required")
	private String firstName;
	private String lastName;
	
	@CourseCode(value="JSP",message = "must start with JSP")
	private String courseCode;
	
	@Min(value = 0, message = "must be greater than 0")
	@Max(value = 10, message = "must be less than 10")
	@NotNull(message = "is required")
	private Integer cgpa;

	@Pattern(regexp = "^[0-9]{6}", message = "only 6 digit")
	private String postalCode;


	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getCgpa() {
		return cgpa;
	}

	public void setCgpa(Integer cgpa) {
		this.cgpa = cgpa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", cgpa=" + cgpa + ", postalCode="
				+ postalCode + "]";
	}

}
