package com.twcch.course.basic.operatorandoperand;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		// 指定運算子
		System.out.printf("a += b: %d\n", a += b);
		System.out.printf("a -= b: %d\n", a -= b);
		System.out.printf("a *= b: %d\n", a *= b);
		System.out.printf("a /= b: %d\n", a /= b);
		System.out.printf("a %%= b: %d\n", a %= b);
		
	}

}
