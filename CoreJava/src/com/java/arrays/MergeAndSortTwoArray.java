package com.java.arrays;

import java.util.Arrays;

public class MergeAndSortTwoArray {

	public static void main(String[] args) {
		mergeAndSort();
	}

	public static void mergeAndSort() {
		int a[] = {3,5,7,9,12,14, 15};
		int b[] = {6,7,10,11,13};
		int j = 0, k = 0;
		int c[] = new int[a.length + b.length];

		for (int i = 0; i < c.length; i++) {
			if (j < a.length && k < b.length) {
				if (b[k] < a[j]) {
					c[i] = b[k];
					k++;
				} else {
					c[i] = a[j];
					j++;
				}
			} else {
				c[i] = a[j];
				j++;
			}
		}
		System.out.println("Merge and Sort array is: " + Arrays.toString(c));
	}
}