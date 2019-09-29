package com.java.basic.program;

public class Prime_Number {
	/*
	 * Prime number is a number that is greater than 1 and divided by 1 or itself
	 * only. In other words, prime numbers can't be divided by other numbers than
	 * itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
	 */
	public static void main(String[] args) {
		isPrimeNumber();
		isPrimeNumberEfficientWay();
	}
	public static void isPrimeNumber() {
		long startTime = System.currentTimeMillis();
		int flag = 0;
		int n = 9999991;
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
		long endTime = System.currentTimeMillis();
		System.out.println("Time took "+(endTime-startTime)+" milliseconds");
	}

	public static boolean isPrimeNumberEfficientWay() {
		long startTime = System.currentTimeMillis();
		int n = 9999991;
		if (n > 2 && n % 2 == 0) {
			System.out.println(n + " is not a prime number");
			return false;
		}
		int top = (int) (Math.sqrt(n) + 1);
		for (int i = 3; i < top; i+=2) {
			if (n % i == 0) {
				System.out.println(n + " is not a prime number");
				return false;
			}
		}
		System.out.println(n + " is a prime number");
		long endTime = System.currentTimeMillis();
		System.out.println("Time took for efficient "+(endTime-startTime)+" milliseconds");
		return true;
	}
}