package com.twcch.course.basic.override;

public class SubClass extends SuperClass {

	/* 
	 * override rule:
	 * 1. 子類別的方法名稱、參數個數、參數型別與回傳值皆須與父類別相同
	 * 2. 如果回傳型別是類別，則可以是原方法回傳型別的子類別
	 * 3. 存取權限修飾子可以放大，不可縮小
	 * 4. throws exception 可以縮小，不可放大
	 * 5. 無法 override 含有 static 或 final 關鍵字的方法 
	 */
	@Override
	public int minus(int x, int y) {
		return x - y;
	}

	@Override
	protected int multiple(int x, int y) {
		return x * y;
	}

	@Override
	public int dividend(int x, int y) {
		return x / y;
	}

	@Override
	public void hello() throws IllegalArgumentException {
		System.out.println("Hello!");
	}

}
