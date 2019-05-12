package com.java.basic.program;

public class Prime_Number {
	/*
	 * Prime number is a number that is greater than 1 and divided by 1 or
	 * itself only. In other words, prime numbers can't be divided by other
	 * numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the
	 * prime numbers.
	 */
	public static void main(String[] args) {
		int flag = 0;
		int n = 17;

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				System.out.println("number is not prime number");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("The Number is Prime Number");
		}

	}
}