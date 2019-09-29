package com.java.basic.program;

public class PyramidPatternEx {

	public static void payrmidPattern() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		payrmidPattern();
	}
}