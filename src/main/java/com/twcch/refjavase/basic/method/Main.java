package com.twcch.refjavase.basic.method;

public class Main {

	public static void main(String[] args) {

		int x = 10;
		int y = 3;

		MyCalculator myCalculator = new MyCalculator();
		int result = myCalculator.add(x, y);

		System.out.println(result);

	}

}
