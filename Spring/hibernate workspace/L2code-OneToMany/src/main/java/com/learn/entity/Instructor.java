package com.learn.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	@OneToOne
	@JoinColumn(name = "ins_detail_id")
	InstructorDetail instructorDetail;
	
	@OneToMany(mappedBy = "cource",fetch = FetchType.LAZY)
	private List<Cource> cources;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", instructorDetail="
				+ instructorDetail + "]";
	}

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