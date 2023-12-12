package com.twcch.course.basic.primitivedatatype;

public class PrimitiveDataTypeLiteral {

	public static void main(String[] args) {

		// 整數型態
		byte num1 = 1;
		short num2 = 2;
		int num3 = 3;
		long num4 = 4L;
		int num5 = 0b0010; // 2 進位
		int num6 = 012; // 8 進位
		int num7 = 0x8e; // 16 進位
		
		System.out.printf("num1 = %4d, num2 = %4d, num3 = %4d, num4 = %4d, num5 = %4d, num6 = %4d, num7 = %4d", 
				num1, num2, num3, num4, num5, num6, num7);
		
		// 浮點數型態
		float num8 = 3.14F;
		double num9 = 3.14; // 或 double num9 = 3.14D;
		
		System.out.printf("\nnum8 = %4f, num9 = %4f", num8, num9);
		
		// 字元型態
		char num10 = '\u0041';
		
		System.out.printf("\nnum10 = %s", num10);
		
		// 布林型態
		boolean num11 = true;
		
		System.out.printf("\nnum11 = %b", num11);

	}

}
