package com.twcch.course.datastructure.array;

import java.util.Arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2, 3 };
		System.out.println("arr1: " + Arrays.toString(arr1));

		int[] arr2 = { 1, 2, 3 };
		System.out.println("arr2: " + Arrays.toString(arr2));

		int[] arr3 = new int[3];
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		System.out.println("arr3: " + Arrays.toString(arr3));
		
	}

}
