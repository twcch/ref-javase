package com.twcch.refjavase.oop.staticmodify;

public class Info {

	static { // 類別初始化
		MSG = "Hello Java!";
	}

	/* 
	 * static:
	 * 1. 當類別被初始化後，會儲存在 global 給所有人共用，只有一份
	 * 2. 可以被透過類別或物件進行呼叫，但透過類別呼叫較為合理
	 * 3. static methods 中，不可使用 this 關鍵字
	 */
	public static String MSG;
	public String MSG_INFO = "ABC";

	private Info() {

	}

}
