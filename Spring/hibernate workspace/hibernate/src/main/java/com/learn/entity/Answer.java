package com.learn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	int ans_id;
	String answer;
	@OneToOne(mappedBy = "ans")
	private Question que;
	
	public Answer() {
	}

	public Answer(int ans_id, String answer,Question que) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
		this.que=que;
	}

	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public void setQue(Question que) {
		this.que=que;
	}

	public Question getQue() {
		return this.que;
	}
	
	@Override
	public String toString() {
		return "Answer [ans_id=" + ans_id + ", answer=" + answer + "que= "+que+"]";
	}
	
	
	
	
}
