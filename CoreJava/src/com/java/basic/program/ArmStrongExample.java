package com.java.basic.program;

public class ArmStrongExample {

	/*
	 * Armstrong Number in Java: A positive number is called armstrong number if
	 * it is equal to the sum of cubes of its digits for example 0, 1, 153, 370,
	 * 371, 407 etc.
	 */
	public static void main(String[] args) {
		isArmStrongExample(153);
	}

	public static void isArmStrongExample(int num) {
		int c = 0, a, temp;
		temp = num;
		while (num > 0) {
			a = num % 10;
			num = num / 10;
			c = c + (a * a * a);
		}
		if (temp == c) {
			System.out.println("armstrong is number");
		} else {
			System.out.println("armstrong is not number");
		}
	}
}