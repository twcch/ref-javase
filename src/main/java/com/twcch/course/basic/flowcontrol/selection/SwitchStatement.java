package com.twcch.course.basic.flowcontrol.selection;

public class SwitchStatement {

	public static void main(String[] args) {

		String str = "A";

		SwitchStatement s = new SwitchStatement();
		boolean result = s.isA(str);

		System.out.println(result);

	}

	public boolean isA(String s) {
		boolean result = false;

		/* 
		 * integer: byte, short, char, int
		 * String
		 * Enum
		 */
		switch (s) {
		case "A":
			result = true;
		default:
			break;
		}

		return result;
	}

}
