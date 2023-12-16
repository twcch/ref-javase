package com.twcch.course.basic.stringclass;

public class StringCompare {

	public static void main(String[] args) {

		String str1 = "hello"; // 儲存在 String pool
		String str2 = new String("hello"); // 儲存在 heap
		String str3 = str2.intern(); // 儲存在 String pool
		String str4 = "hel" + "lo"; // 儲存在 String pool
		String str5 = "hel".concat("lo"); // 儲存在 heap

		StringCompare sc = new StringCompare();

		System.out.println("str1 vs str2 reference: " + sc.compareReference(str1, str2));
		System.out.println("str1 vs str2 value: " + sc.compareValue(str1, str2));

		System.out.println("str1 vs str3 reference: " + sc.compareReference(str1, str3));
		System.out.println("str1 vs str3 value: " + sc.compareValue(str1, str3));

		System.out.println("str1 vs str4 reference: " + sc.compareReference(str1, str4));
		System.out.println("str1 vs str4 value: " + sc.compareValue(str1, str4));

		System.out.println("str1 vs str5 reference: " + sc.compareReference(str1, str5));
		System.out.println("str1 vs str5 value: " + sc.compareValue(str1, str5));

	}

	public boolean compareReference(String str1, String str2) {

		return str1 == str2 ? true : false;

	}

	public boolean compareValue(String str1, String str2) {

		return str1.equals(str2);

	}

}
