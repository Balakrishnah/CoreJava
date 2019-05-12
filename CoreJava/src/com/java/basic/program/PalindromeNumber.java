package com.java.basic.program;

/*A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
 It can also be a string like LOL, MADAM etc*/
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		isPalindromeNumber(121);
		isPalindromeAnotherWay("LOL");
	}

	public static void isPalindromeNumber(int n) {
		int r, sum = 0, temp;
		temp = n;
		while (n > 0) {
			r = n % 10;			
			sum = (sum * 10) + r;			
			n = n / 10;			
		}
		if (temp == sum) {
			System.out.println("The number is Palindrome Number");
		} else {
			System.out.println("The Number is not Palindrome Number");
		}
	}

	public static void isPalindromeAnotherWay(String orginal) {
		int length = orginal.length();
		String reverse = "";
		for (int i = length-1; i>=0; i--) {
			reverse = reverse + orginal.charAt(i);
		}
		if (orginal.equals(reverse)) {
			System.out.println("Entered String/number is palindrome");
		} else {
			System.out.println("Entered String/number not a palindrome");
		}
	}
}