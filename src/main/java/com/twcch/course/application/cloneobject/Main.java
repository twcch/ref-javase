package com.twcch.course.application.cloneobject;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		User user1 = new User(1, "Alan");
		User user2 = (User) user1.clone();
		
		user2.setId(2);
		user2.setName("Amy");
		
		System.out.println(user1);
		System.out.println(user2);
		
	}

}
