package com.twcch.course.basic.memory;

public class Main {

	public static void main(String[] args) {
		
		int id = 1; // 儲存在 stack: int id = 1
		String name = "Alan"; // 儲存在 stack: String name = (reference) => String pool: "Alan"
		
		User user1 = new User(id, name); // 儲存在 stack: User user1 = (reference) => heap: new User(id, name)
		User user2 = user1; // 儲存在 stack: User user1 = (reference) 會指向 user1 的位置
		
		System.out.println("user2 name: " + user2.name());

	}

}