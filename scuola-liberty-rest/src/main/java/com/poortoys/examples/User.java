package com.poortoys.examples;

public class User {
	private String name;
	private String surname;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	// Jakarta JSON requires a no-argument constructor.
	// Setters and Setters omitted
	
}
