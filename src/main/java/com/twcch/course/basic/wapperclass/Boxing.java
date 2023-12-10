package com.twcch.course.basic.wapperclass;

public class Boxing {

	public static void main(String[] args) {

		int a = 10;
		Integer b = a; // auto boxing: 隱含調用 Integer.valueOf()
		int c = b; // auto unboxing: 隱含調用 Integer.intValue()

		System.out.println("c = " + c);

	}

}
