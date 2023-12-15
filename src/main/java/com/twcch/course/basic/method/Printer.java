package com.twcch.course.basic.method;

public class Printer {

	public void print(String message, int times) {

		while (times > 0) {
			System.out.println("Printer: " + message);
			times--;
		}

	}

}
