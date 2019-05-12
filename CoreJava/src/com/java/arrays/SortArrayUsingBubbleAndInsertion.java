package com.java.arrays;

import java.util.Arrays;

public class SortArrayUsingBubbleAndInsertion {

	public static void main(String[] args) {
		int[] insertionSort = { 3, 1, 9, 5, 10, 8 };
		int[]bubleAscSort ={100,30,10,50,20,40};
		int[]bubleDscSort ={10,60,25,15,85,95,6};
		String[] stringArr = { "X", "S", "B", "N", "G" };
		
		// sort the array using the utility method		
		Arrays.sort(stringArr);		
		System.out.println("Sort the array Using utility method: "+ Arrays.toString(stringArr));
		System.out.println("*******************Before Insertion Sort************");
		insertionSortArray(insertionSort);
		System.out.println("*********After ascendingBubbleSort**************");
		ascendingBubbleSort(bubleAscSort);
		System.out.println("*********After ascendingBubbleSort**************");
		descendingBubbleSort(bubleDscSort);
	}
	
	       /* 1st index iteration: value at 1st index = 4, which is less than 5, so array becomes [5, 5, 14, 2, 8], as we reached the start we place the value at 0th index and array becomes [4, 5, 14, 2, 8]
			2nd index iteration: value at 2nd index = 14 which is greater than 5, so leave the array as it is. Now array = [4, 5, 14, 2, 8]
			3rd index iteration: value at 3rd index = 2 which is smaller than 14, so array becomes [4, 5, 14, 14, 8], again 2 is smaller than 5, so array becomes [4, 5, 5, 14, 8]. Again 2 is smaller than 4, so array becomes [4, 4, 5, 14, 8]. As we reached the start of array, we place 2 at 0th index and array becomes [2, 4, 5, 14, 8]
			4th index iteration: value at 4th index = 8, so array becomes [2, 4, 5, 14, 14], then 8 is greater than 5, so place 8 at the 14th place and array becomes [2, 4, 5, 8, 14]. And our array is sorted now.
*/	public static void insertionSortArray(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int valueToSort = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > valueToSort) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = valueToSort;
			System.out.println("insertionSortArray "+(i+1)+"th iteration: " + Arrays.toString(arr));
		}
		System.out.println("Insertion Sort: " + Arrays.toString(arr));
	}

	/*1)In bubble sort, the array of integers is traversed from index 0 to length-1.
	2)The value at 0th position is compared with the value at 1st position and if the later is small, it’s swapped.
	3)The comparison is moved from the 0th index to length-1 index so that after the first iteration, the last index has the biggest value.
	4)The same process is repeated again from 0th to length-1 index. After (length-1) iteration, the array is sorted.
	5)In worst-case, the complexity of bubble sort is O(n2) and in best-case, the complexity of bubble sort is Ω(n).*/
	public static void ascendingBubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("ascendingBubbleSort after "+(i+1)+"th iteration :"+Arrays.toString(arr));
		}
	}
	public static void descendingBubbleSort(int[]arr){
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j-1]<arr[j]){
					temp =arr[j-1];
					arr[j-1] =arr[j];
					arr[j] =temp;
				}
			}
			System.out.println("descendingBubbleSort after "+(i+1)+"th iteration :"+Arrays.toString(arr));
		}
	}
}
