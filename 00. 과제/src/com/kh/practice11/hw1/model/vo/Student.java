package com.kh.practice11.hw1.model.vo;

public class Student extends Person{

	private int grade;
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.grade = grade;
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String infomation() {
		return  "grade=" + grade + ", major=" + major;
	}

	public String information() {
		return "information = " + super.information() + "grade=" + grade + ", major=" + major;
	}
	
	
	
}
