package com.twcch.course.basic.operatorandoperand;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		// 條件運算子
		System.out.printf("a > b && a < b: %b \n", a > b && a < b);
		System.out.printf("a > b || a < b: %b \n", a > b || a < b);
		System.out.printf("!(a > b || a < b): %b \n", !(a > b || a < b));
		
	}

}
