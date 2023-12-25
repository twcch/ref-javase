package com.twcch.refjavase.alogrithm.array;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = new int[] { -1, 0, 3, 5, 9, 12 };
		int target = 9;

		BinarySearch t = new BinarySearch();
		int result = t.search(nums, target);

		System.out.println("result: " + result);

	}

	public int search(int[] nums, int target) {

		int left = 0;
		int right = nums.length;

		while (left <= right) {
			int middle = left + (right - left) / 2;
			if (target < nums[middle]) {
				// left
				right = middle - 1;
			} else if (target > nums[middle]) {
				// right
				left = middle + 1;
			} else if (target == nums[middle]) {
				return middle;
			}
		}

		return -1;

	}

}
