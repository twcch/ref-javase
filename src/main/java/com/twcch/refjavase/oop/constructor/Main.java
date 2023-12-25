package com.twcch.refjavase.oop.constructor;

public class Main {

	public static void main(String[] args) {

		String hello = MyMsg.HELLO;

		MyInfo info = new MyInfo(hello);

		System.out.println(info.getInfo());

	}

}
