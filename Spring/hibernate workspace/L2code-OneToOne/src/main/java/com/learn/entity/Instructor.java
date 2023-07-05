package com.learn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "ins_detail_id")
	InstructorDetail instructorDetail;

//	public Instructor(int id, String answer, String firstName, String lastName) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
//
//	public Instructor() {
//		super();
//	}

}