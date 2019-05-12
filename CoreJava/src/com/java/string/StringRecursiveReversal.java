package com.java.string;


public class StringRecursiveReversal {
	static String reverse = ""; 
	public static void main(String[] args) {
		String name = "Balakrishna Gowda";
		String revName =reverseString(name);
		System.out.println(" Reverse String result: "+revName);
	}
	
	public static String reverseString(String str){
		int inputLength = str.length();
		if(inputLength ==1){
			return str;
		} else{
			reverse += str.charAt(inputLength-1)+ reverseString(str.substring(0, inputLength-1));
		}
		return reverse;
	}
}