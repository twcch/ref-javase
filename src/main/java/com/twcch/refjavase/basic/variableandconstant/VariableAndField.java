package com.twcch.refjavase.basic.variableandconstant;

public class VariableAndField {

	public final double NEW_PI = 3.141; // field: instance variable
	public static final double PI = 3.14159; // field: static variable

	public static void main(String[] args) {

		System.out.println("PI: " + PI);

		final double PI = 3.14; // local variable

		System.out.println("PI: " + PI);

		VariableAndField v = new VariableAndField();
		System.out.println("NEW_PI: " + v.NEW_PI);

	}

}
