package com.twcch.refjavase.alogrithm.array;

import java.util.Arrays;

public class SquaresOfASortedArray {

	public static void main(String[] args) {

		int[] nums = new int[] { -4, -1, 0, 3, 10 };

		SquaresOfASortedArray t = new SquaresOfASortedArray();
		int[] results = t.sortedSquares(nums);

		System.out.println("results: " + Arrays.toString(results));

	}

	public int[] sortedSquares(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			nums[i] = (int) Math.pow(nums[i], 2);
		}

		Arrays.sort(nums);

		return nums;

	}

}
