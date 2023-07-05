package com.learn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class InstructorDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String hobby;
	String youtubeChannel;

	@OneToOne(mappedBy = "instructorDetail")
	Instructor instructor;

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", hobby=" + hobby + ", youtubeChannel=" + youtubeChannel
				+ ", instructor=" + instructor + "]";
	}

}
