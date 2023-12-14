package com.twcch.course.basic;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello world!");

		String str = "";

		z: for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 2; y++) {
				if (x == 1)
					break;
				if (y == 2)
					break z;
				str = str + x + y;
				System.out.printf("str: %10s, x: %d, y: %d \n", str, x, y);
			}
		}

		System.out.println(str);

	}

}