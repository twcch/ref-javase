package com.twcch.course.basic.stringclass;

public class DeclareString {

	public static void main(String[] args) {
		
		String str1 = "Hello"; // 宣告 String 儲存在 String pool
		System.out.println("str1: " + str1);
		
		String str2 = new String("Hello"); // 宣告 String 儲存在 heap
		System.out.println("str2: " + str2);

	}

}
