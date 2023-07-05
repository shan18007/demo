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

import lombok.Data;

@Entity
@Data
public class Cource {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String courceName;
	private String courceDesc;
	@ManyToOne
	@JoinColumn(name = "insructor_id")
	private Instructor instructor;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cource_id")
	private List<Review> reviews;
}
