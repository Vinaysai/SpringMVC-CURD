package com.spring.bean;

public class Employee {

	private int id;
	private String name;

	private float salary;
		
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}
