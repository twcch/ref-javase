package com.twcch.testjava.algorithm;

import java.util.Arrays;

public class RemoveElementor {

	public static void main(String[] args) {
		
		int[] nums = {3, 2, 2, 3};
		int val = 3;
		
		RemoveElementor re = new RemoveElementor();
		int result = re.reomveElementor(nums, val);
		
		System.out.println("result: " + result); // return 2
		
	}
	
	public int reomveElementor(int[] nums, int val) {
		
		int slowIndex = 0;
		
		for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
			if (nums[fastIndex] != val) {
				nums[slowIndex++] = nums[fastIndex];
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
		return slowIndex;
		
	}

}
