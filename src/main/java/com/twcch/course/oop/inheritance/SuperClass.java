package com.twcch.course.oop.inheritance;

public class SuperClass {
	
	public int x = 10;
	public static final int y = 5;
	
	public SuperClass() {
		
	}
	
	public SuperClass(int x) {
		this.x = x;
	}
	
	public static void show() {
		System.out.println("Hello!");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static int getY() {
		return y;
	}
	
}
