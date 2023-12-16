package com.twcch.course.basic.mutableandimmutable;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Alan", 30);
		User user2 = user1;
		
		addId(user1.id);
		changeName(user1.name);
		addAge(user1);
		
		user2.show();
		
	}
	
	public static void addId(int id) { // immutable
		
		id = id + 1;
		
	}
	
	public static void changeName(String name) { // immutable
		
		name = name + "'s";
		
	}
	
	public static void addAge(User user) { // mutable
		
		user.age = user.age + 1;
		
	}

}