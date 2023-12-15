package com.twcch.course.basic.method;

public class Printer {

	private int count = 0;

	public Printer(int count) {
		this.count = count;
	}

	public void print(String msg) throws IllegalArgumentException {

		if (count <= 0) {
			return;
		}

		System.out.println("Printer: " + msg);

	}

	void print(String msg, int times) { // overloading

		while (times > 0) {
			if (count <= 0) {
				return;
			}

			System.out.println("Printer: " + msg);
			count--;
		}

	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
