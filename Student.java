package com.jsp.Encapsulation;

public class Student {
	private int id;
	private String name;
	private String email;// data hidding
	private String course;
	
	//to getter the value of current object
	public int getId() {
		return id;
	}
	// to setter the value for int id
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}


