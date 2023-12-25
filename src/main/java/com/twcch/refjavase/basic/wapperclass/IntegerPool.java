package com.twcch.refjavase.basic.wapperclass;

public class IntegerPool {

	public static void main(String[] args) {

		Short i1 = 127;
		Short i2 = 127;

		/*
		 * 當 Short, Integer, ... 等整數型別的值 < 128，會將值儲存於 Integer pool，所以使用 == 會是 true
		 * 當 Short, Integer, ... 等整數型別的值 >= 128，會將值儲存於 heap，所以使用 == 會是 false
		 */
		System.out.println("i1 == i2: " + (i1 == i2));
		System.out.println("i1.equals(i2): " + i1.equals(i2));

	}

}
