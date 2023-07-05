package com.learn.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	int q_id;
	String question;
	@OneToMany(mappedBy = "que",cascade = CascadeType.ALL)
	List<Answer> ans;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int q_id, String question, List<Answer> ans) {
		super();
		this.q_id = q_id;
		this.question = question;
		this.ans = ans;
	}
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [q_id=" + q_id + ", question=" + question + ", ans=" + ans + "]";
	}
	
	
	
}
