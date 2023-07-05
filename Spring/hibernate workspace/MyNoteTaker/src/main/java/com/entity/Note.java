package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String note;
	private Date added_date;
	
	public Note(String title, String note,Date added_date){
		this.title = title;
		this.note = note;
		this.added_date= added_date;
	}

	public Note() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getAdded_date() {
		return added_date;
	}

	public void setAdded_date(Date added_date) {
		this.added_date = added_date;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", title=" + title + ", note=" + note + ", added_date=" + added_date + "]";
	}
	
	
	
	
}
