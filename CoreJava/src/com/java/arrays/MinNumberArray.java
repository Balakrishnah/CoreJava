package com.java.arrays;

public class MinNumberArray {

	public static void main(String[] args) {
		int arr[] ={33,10,50,4};
		min(arr);
	}
	
	public static void min(int [] a){
		int min = a[0];
		for(int i=0;i<=a.length-1;i++){
			if(min>a[i]){
				min = a[i];
			}
		}
	}

}
