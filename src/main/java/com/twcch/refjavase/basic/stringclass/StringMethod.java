package com.twcch.refjavase.basic.stringclass;

public class StringMethod {

	public static void main(String[] args) {

		String str = "  Hello World!   ";

		System.out.println("str.length(): " + str.length()); // 取得 String 的長度
		System.out.println("str.isEmpty(): " + str.isEmpty()); // 取得 boolean 判斷 String 是否為空
		System.out.println("str.isBlank(): " + str.isBlank()); // 取得 boolean 判斷 String 是否為空白
		System.out.println("str.trim(): " + str.trim()); // 刪除 String 前後的空白字元

		System.out.println("str.charAt(4): " + str.charAt(4)); // 取得 String index 的字元
		System.out.println("str.substring(1): " + str.substring(1)); // 取得指定 String index 後的所有字元
		System.out.println("str.substring(1, 5): " + str.substring(1, 8)); // 取得指定 String index 區間 (start, end - 1) 的字元

		String str1 = "Hello";
		String str2 = "hello";
		/* 
		 * compareTo():
		 * 由左至右比較，依照字元 ASCII 值比較大小
		 * 1. return =0: 表示兩個字串相等
		 * 2. return >0: 表示左邊的字串大於右邊的字串
		 * 3. return <0: 表示左邊的字串小於右邊的字串
		 */
		System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));

	}

}
