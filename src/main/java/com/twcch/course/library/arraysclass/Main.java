package com.twcch.course.library.arraysclass;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 3, 4, 1, 2, 5 };
		System.out.println("arr1: " + Arrays.toString(arr1)); // 將一維陣列的所有元素轉成字串
		
		Arrays.sort(arr1); // 排序陣列
		System.out.println("arr1: " + Arrays.toString(arr1));
		
		int search = 4;
		int index = Arrays.binarySearch(arr1, search); // 二分查找法 (需排序後)
		System.out.println("arr1 search: " + search + ", result index: " + index); // 當沒有搜尋到時，會回傳一個小於 0 的整數
		
		int[] newArr1 = Arrays.copyOf(arr1, 9); // 複製陣列
		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("new arr1: " + Arrays.toString(newArr1));

		int[][] arr2 = new int[][] { { 3, 4, 1 }, { 2, 5 } };
		System.out.println("arr2: " + Arrays.deepToString(arr2)); // 將二維陣列的所有元素轉成字串

	}

}
