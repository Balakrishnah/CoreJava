package com.java.arrays;

import java.util.Arrays;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 2, 3, 4, 3 };
		removeDuplicateInArray(arr);
		removeDuplicateWithEfficient(arr);
	}

	public static void removeDuplicateInArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > 0 && temp == arr[j]) {
					arr[j] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void removeDuplicateWithEfficient(int[] arr1) {
		Arrays.sort(arr1);
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] == arr1[i - 1]) {
				arr1[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}
