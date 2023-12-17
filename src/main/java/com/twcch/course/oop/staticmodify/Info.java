package com.twcch.course.oop.staticmodify;

public class Info {
	
	/* 
	 * static:
	 * 1. 當類別被初始化後，會儲存在 global 給所有人共用，只有一份
	 * 2. 可以被透過類別或物件進行呼叫，但透過類別呼叫較為合理
	 */
	public static final String MSG = "Hello Java!";
	
	private Info() {
		
	}
	
}
