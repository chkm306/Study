package com.kh.practice8.example3.model.vo;

public class Employee { // 클래스 기본생성자 생성자 게터세터 인포
	
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(String empName, String dept, String job, int age, char gender, int salary, double bonusPoint,
			String phone, String address) {
		super();
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public double getBonusPoint() {
		return bonusPoint;
	}


	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String information() {
		return "empName=" + empName + ", dept=" + dept + ", job=" + job + ", age=" + age + ", gender="
				+ gender + ", salary=" + salary + ", bonusPoint=" + bonusPoint + ", phone=" + phone + ", address="
				+ address;
	}
	
	
	


}
