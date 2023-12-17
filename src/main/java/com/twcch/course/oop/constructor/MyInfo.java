package com.twcch.course.oop.constructor;

public class MyInfo {

	private String info;

	/* 
	 * constructor:
	 * 1. constructor 名稱一定要與 class 一致
	 * 2. constructor 沒有回傳型別
	 * 3. 若 class 沒有 constructor: Java 會預設建立一個無參的 constructor，但該類別只要有任一個 constructor: Java 就不會自動建立 constructor
	 * 4. constructor 第一行預設呼叫 super() 的方法
	 */
	public MyInfo() { // 無參建構子

	}

	public MyInfo(String info) { // 有參建構子
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

}
