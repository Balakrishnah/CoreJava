package com.java.string;

public class StringPalindrome {
	public static boolean ispalindrome(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String st = sb.toString();

		if (str.equals(st)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {		
		System.out.println(ispalindrome("madam"));
		System.out.println(ispalindrome("121"));
		System.out.println(ispalindrome("123"));
	}
}
