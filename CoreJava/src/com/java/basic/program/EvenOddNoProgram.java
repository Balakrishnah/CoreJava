package com.java.basic.program;

public class EvenOddNoProgram {

	public static void isCheckEvenOrOdd(int num) {
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
	}
	public static void main(String[] args) {
		isCheckEvenOrOdd(10);
	}
}