package com.java.arrays;

public class MinNumberArray {

	public static void main(String[] args) {
		int arr[] = { 33, 10, 50, 4 };
		System.out.println("The minimum: " + min(arr));
		System.out.println("The maximum: " + max(arr));
	}

	public static int min(int[] a) {
		int min = a[0];
		for (int i = 1; i <= a.length - 1; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
