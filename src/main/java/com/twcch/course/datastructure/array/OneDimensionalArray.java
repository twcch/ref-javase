package com.twcch.course.datastructure.array;

import java.util.Arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2, 3 }; // array 為連續、長度不可變的
		System.out.println("arr1: " + Arrays.toString(arr1));

		int[] arr2 = { 1, 2, 3 };
		System.out.println("arr2: " + Arrays.toString(arr2));

		int[] arr3 = new int[3];
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		System.out.println("arr3: " + Arrays.toString(arr3));

		reverse(arr1);

		System.out.println("reverse arr1: " + Arrays.toString(arr1));

	}

	public static void reverse(int[] array) { // mutable

		int start = 0;
		int end = array.length - 1;
		int middle = start + (end - start) / 2;

		int temp = 0;
		while (start < middle) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
		}

	}

}
