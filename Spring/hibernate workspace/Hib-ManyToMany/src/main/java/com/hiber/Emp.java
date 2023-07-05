package com.hiber;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int e_id;
	private String name;
	@ManyToMany
	@JoinTable
	(
			name = "emp_project",
			joinColumns = {@JoinColumn(name="eid")},
			inverseJoinColumns = {@JoinColumn(name="pid")}
			
	)
	private List<Project> project;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int e_id, String name, List<Project> project) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.project = project;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

}
