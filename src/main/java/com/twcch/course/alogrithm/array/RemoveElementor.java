package com.twcch.course.alogrithm.array;

import java.util.Arrays;

public class RemoveElementor {

	public static void main(String[] args) {

		int[] nums = new int[] { 3, 2, 2, 3 };
		int val = 3;

		RemoveElementor t = new RemoveElementor();
		int result = t.removeElementor(nums, val);

		System.out.println("result: " + result);

	}

	public int removeElementor(int[] nums, int val) {

		int slowIndex = 0;

		for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
			if (nums[fastIndex] != val) {
				nums[slowIndex++] = nums[fastIndex];
			}
		}

		System.out.println("nums: " + Arrays.toString(nums));

		return slowIndex;

	}

}
