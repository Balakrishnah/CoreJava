package com.java.string;

public class ReverseStringUsingRecursive {

	public static void main(String[] args) {
		String reversed = reverseString("babu");
		System.out.println(reversed);
	}

	public static String reverseString(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}