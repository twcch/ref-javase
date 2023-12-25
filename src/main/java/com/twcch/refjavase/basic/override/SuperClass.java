package com.twcch.refjavase.basic.override;

public class SuperClass {

	private int add(int x, int y) {
		return x + y;
	}

	int minus(int x, int y) {
		return x - y;
	}

	protected int multiple(int x, int y) {
		return x * y;
	}

	public int dividend(int x, int y) {
		return x / y;
	}

	public void hello() throws RuntimeException {
		System.out.println("Hello");
		add(0, 0);
	}

	public static void show() { // 無法被 override
		System.out.println("Hello");
	}

}
