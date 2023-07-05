package com.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int ans_Id;
	private String ans;
	
	@ManyToOne
	@JoinColumn(name = "que_id")
	private Question que;

	public Answer() {
		super();
	}

	public Answer(int ans_Id, String ans, Question que) {
		super();
		this.ans_Id = ans_Id;
		this.ans = ans;
		this.que = que;
	}

	public int getAns_Id() {
		return ans_Id;
	}

	public void setAns_Id(int ans_Id) {
		this.ans_Id = ans_Id;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Question getQue() {
		return que;
	}

	public void setQue(Question que) {
		this.que = que;
	}

	@Override
	public String toString() {
		return "Answer [ans_Id=" + ans_Id + ", ans=" + ans + ", que=" + que + "]";
	}


}
