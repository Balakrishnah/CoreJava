package com.java.arrays;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 2, 3, 4, 3 };
		removeDuplicateInArray(arr);
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
	}
}
