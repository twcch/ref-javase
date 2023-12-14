package com.twcch.course.basic.flowcontrol.selection;

public class IfStatement {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// 循序結構 sequence
		if (a > 10) {
			System.out.println("a > 10");
		}
		
		if (b > 10) {
			System.out.println("b > 10");
		}
		
		// 選擇結構 section
		if (a > 10) {
			System.out.println("a > 10");
		} else if (b > 10) {
			System.out.println("b > 10");
		} else {
			System.out.println("else");
		}
		
		
	}

}
