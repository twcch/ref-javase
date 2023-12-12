package com.twcch.course.basic.primitivedatatype;

public class PrimitiveDataLiteral {

	public static void main(String[] args) {
		
		/* 
		 * byte => short, char => int => long => float => double
		 * boolean
		 */
		byte a = 1; // Java 會自動進行隱式轉型
		short b = 10;
		char c = 'A';
		int d = 1000; // Literal
		long e = 312L;
		float f = 3.14F;
		double g = 3.14; // 也可以是 3.14D
		boolean h = true;
		
		System.out.printf("a = %4d, b = %4d, c = %4s, d = %4d, e = %4d, "
				+ "f = %4f, g = %4f, h = %b", a, b, c, d, e, f, g, h);

	}

}
