package com.practice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {

	@Id
	private int q_Id;
	private String question;
	@OneToMany(mappedBy = "que")
	private List<Answer> answer;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int q_Id, String question, List<Answer> answer) {
		super();
		this.q_Id = q_Id;
		this.question = question;
		this.answer = answer;
	}

	public int getQ_Id() {
		return q_Id;
	}

	public void setQ_Id(int q_Id) {
		this.q_Id = q_Id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [q_Id=" + q_Id + ", question=" + question + ", answer=" + answer + "]";
	}
	
	

}
