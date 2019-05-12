package com.java.string;


public class ReverseEachWord {

	static void reverseEach(String str) {
		String word[] = str.split(" ");
		String reverse = "";
		for (int i = 0; i < word.length; i++) {
			String war = word[i];
			System.out.println(war);
			String reverseWord = " ";
			for (int j = war.length() - 1; j >= 0; j--) {

				reverseWord = reverseWord + war.charAt(j);

			}
			reverse = reverse + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println("*************");
		System.out.println(reverse);
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		
		String s1 = "welcome to itc";
		reverseEach(s1);
	}

}
