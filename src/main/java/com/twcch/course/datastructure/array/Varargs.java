package com.twcch.course.datastructure.array;

public class Varargs {

	public static void main(String... args) {

		String[] strings = new String[] { "A", "B", "C", "D" };
		print(strings);

	}

	public static void print(String... strings) {

		for (String str : strings) {
			System.out.println(str);
		}

	}

}
