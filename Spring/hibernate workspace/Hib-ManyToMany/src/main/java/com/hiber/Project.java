package com.hiber;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int p_id;
	private String pname;
	@ManyToMany(mappedBy = "project")
	private List<Emp> emp;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int p_id, String pname, List<Emp> emp) {
		super();
		this.p_id = p_id;
		this.pname = pname;
		this.emp = emp;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}

}
