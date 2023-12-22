package com.twcch.course.inheritance;

public class SuperClass { // 預設繼承 Object
	
	public int a;
	protected int b;
	int c;
	private int d;
	
	public SuperClass(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public void superHello() {
		System.out.println("Super Class!");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "SuperClass [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
}
