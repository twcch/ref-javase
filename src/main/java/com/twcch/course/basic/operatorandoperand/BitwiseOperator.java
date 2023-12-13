package com.twcch.course.basic.operatorandoperand;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		// 位元運算子
		System.out.printf("a > b & a < b: %b \n", a > b & a < b);
		System.out.printf("a > b | a < b: %b \n", a > b | a < b);
		System.out.printf("a > b ^ a < b: %b \n", a > b ^ a < b); // 其中一邊為 true 才會是 true，否則為 false
		System.out.printf("!~a: %d \n", ~a);

	}

}
