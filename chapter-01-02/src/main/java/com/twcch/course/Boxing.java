package com.twcch.course;

public class Boxing {

	public static void main(String[] args) {
		
		int a = 10;
		Integer b = a; // auto boxing: 隱含調用 Integer.valueOf()
		
		System.out.println("b size: " + b.SIZE);
		
		int c = b; // auto unboxing: 隱含調用 Integer.intValue()
		
		System.out.println("c: " + c);
		
	}

}
