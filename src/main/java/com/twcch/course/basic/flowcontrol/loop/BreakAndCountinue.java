package com.twcch.course.basic.flowcontrol.loop;

public class BreakAndCountinue {

	public static void main(String[] args) {

		int a = 3;

		for (int i = 0; i < 10; i++) {
			if (i == a) {
				continue; // 中斷本次迭代
			}
			
			if (i == 9) {
				break; // 中斷迴圈
			}
			
			System.out.print(i + " ");
		}

	}

}
