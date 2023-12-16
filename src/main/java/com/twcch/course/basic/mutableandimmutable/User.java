package com.twcch.course.basic.mutableandimmutable;

public class User {
	
	public int id;
	public String name;
	public int age;
	
	public User(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
