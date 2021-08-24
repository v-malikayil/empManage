package com.jenkinstuff.empmanage;

public class Employee {
	private String name;
	private long salary;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	long getSalary() {
		return salary;
	}
	void setSalary(long salary) {
		this.salary = salary;
	}
	Employee(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println("Name: " + name + " Salary: " + salary);
	}
}