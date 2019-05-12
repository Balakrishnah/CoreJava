package com.java.basic.program;

public class Fibonacci_Series {
	static int n1 =0, n2 =1, n3 =0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fibnocciWithRecursive(5);
		System.out.println("************************");
		fibonacciwithoutRecursive(5);
	}

	public static void fibonacciwithoutRecursive(int count) {
		int n1 =0, n2 =1, n3 =0;
		System.out.println(n1 + " " + n2);
		for (int i = 2; i <= count; ++i) {
			n3 = n1 + n2;
			System.out.println("fibonacciwithoutRecursive: " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void fibnocciWithRecursive(int count) {
		
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println("fibnocciWithRecursive : " + n3);
			fibnocciWithRecursive(count-1);
		}
	}
}
