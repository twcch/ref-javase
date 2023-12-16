package com.twcch.course.basic.override;

public class SubClass extends SuperClass {
	
	/* 
	 * override rule:
	 * 1. 存取權限修飾子可以放大，不可縮小
	 * 2. throws exception 可以縮小，不可放大
	 */
	@Override
	public int minus(int x, int y) {
		return x - y;
	}

	@Override
	protected int multiple(int x, int y) {
		return x * y;
	}

	@Override
	public int dividend(int x, int y) {
		return x / y;
	}

	@Override
	public void hello() throws IllegalArgumentException {
		System.out.println("Hello!");
	}
	
}
