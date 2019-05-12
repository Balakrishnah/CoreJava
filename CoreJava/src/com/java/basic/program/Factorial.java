package com.java.basic.program;

public class Factorial {
	/*
	 * Factorial Program in Java: Factorial of n is the product of all positive
	 * descending integers. Factorial of n is denoted by n!. 
	 * For example:
	 * 4! = 4*3*2*1 = 24 
	 * 5! = 5*4*3*2*1 = 120
	 */
	public static void factNum(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static int recursiveFactNum(int num) {
		if (num == 0) {
			return 1;
		} else {
			return (num * recursiveFactNum(num - 1));
		}
	}

	public static void main(String[] args) {
		factNum(5); // calling method with anonymous object(without reference)
		System.out.println("************************");
		System.out.println(recursiveFactNum(5));
	}

}
