package com.twcch.course.datastructure.array;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5 } };
		System.out.println("arr1: " + Arrays.deepToString(arr1));

		int[][] arr2 = { { 1, 2, 3 }, { 4, 5 } };
		System.out.println("arr2: " + Arrays.deepToString(arr2));

		int[][] arr3 = new int[2][3];
		arr3[0][0] = 1;
		arr3[0][1] = 2;
		arr3[0][2] = 3;
		arr3[1][0] = 4;
		arr3[1][1] = 5;
		System.out.println("arr3: " + Arrays.deepToString(arr3));

		int[][] arr4 = new int[2][];
		arr4[0] = new int[3];
		arr4[0][0] = 1;
		arr4[0][1] = 2;
		arr4[0][2] = 3;
		arr4[1] = new int[2];
		arr4[1][0] = 4;
		arr4[1][1] = 5;
		System.out.println("arr4: " + Arrays.deepToString(arr4));

	}

}
