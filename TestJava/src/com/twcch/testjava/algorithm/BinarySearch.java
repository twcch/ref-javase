package com.twcch.testjava.algorithm;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = { -1, 0, 3, 5, 9, 12 };

		BinarySearch t = new BinarySearch();
		int result = t.search(nums, 9);

		System.out.println("result: " + result);

	}

	public int search(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target < nums[mid]) {
				// left: 表示 target 落於左區塊
				right = mid - 1;
			} else if (target > nums[mid]) {
				// right: 表示 target 落於右區塊
				left = mid + 1;
			} else if (target == nums[mid]) {
				return mid;
			}

		}

		return -1;

	}

}
