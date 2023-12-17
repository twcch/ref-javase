package com.twcch.course.basic.operatorandoperand;

public class ShiftOperator {

	public static void main(String[] args) {

		int a = 3;
		int b = 2;

		// shift operator
		System.out.printf("a >> b: %d \n", a >> b); // 將 a 向右移動 b 個位元（具正負值）
		System.out.printf("a << b: %d \n", a << b); // 將 a 向左移動 b 個位元（具正負值）
		System.out.printf("a >>> b: %d \n", a >>> b); // 將 a 向右移動 b 個位元（不具正負值向右移動，以 0 位元補進）

	}

}
