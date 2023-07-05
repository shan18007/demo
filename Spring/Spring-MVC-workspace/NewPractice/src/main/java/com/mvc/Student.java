package com.mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

	private int sid;
	private String sname;
	private String favLanguage;
	private String[] hobbies;
	private List<String> favLanguageOptions;

	Student() {
		favLanguageOptions=new ArrayList<String>();
		favLanguageOptions.add("C#");
		favLanguageOptions.add("Python");
		favLanguageOptions.add("Java");
		favLanguageOptions.add("PHP");
	}

	public List<String> getFavLanguageOptions() {
		return favLanguageOptions;
	}

	public Student(int sid, String sname, String favLanguage, String[] hobbies) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.favLanguage = favLanguage;
		this.hobbies = hobbies;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", favLanguage=" + favLanguage + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}


}
