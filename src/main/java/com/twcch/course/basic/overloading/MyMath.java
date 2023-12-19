package com.twcch.course.basic.overloading;

public class MyMath {

	public int add(int x, int y) {
		return x + y;
	}

	/*
	 * overloading rule:
	 * 1. 只看方法名稱右邊的傳輸參數
	 * 2. 方法的傳輸參數數量或參數型態必須要有一個以上不同
	 */
	public int add(int x, int y, int z) {
		return x + y + z;
	}

	public void add() {
		System.out.println("add");
	}

	public static void add(String msg) {
		System.out.println(msg);
	}

	public static void add(String... msg) {
		System.out.println("default msg");
	}

}
