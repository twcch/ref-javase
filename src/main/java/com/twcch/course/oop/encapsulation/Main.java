package com.twcch.course.oop.encapsulation;

public class Main {

	public static void main(String[] args) {

		User user = new User(1, "Alan", 29);
		user.setAge(30);

		System.out.println(user.toString());

	}

}
