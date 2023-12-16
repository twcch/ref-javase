package com.twcch.course.oop.newobject;

public class User {
	
	private int id;
	private String name;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void show() {
		System.out.println(toString());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

}
