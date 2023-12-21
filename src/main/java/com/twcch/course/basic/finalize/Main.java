package com.twcch.course.basic.finalize;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1, "Alan");
		
		System.out.println(user);
		
		user = null;
		
		System.gc();
		
	}

}
