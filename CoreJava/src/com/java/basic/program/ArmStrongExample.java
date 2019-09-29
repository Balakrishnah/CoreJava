package com.java.basic.program;

public class ArmStrongExample {

	/*
	 * Armstrong Number in Java: A positive number is called armstrong number if
	 * it is equal to the sum of cubes of each digits for example 0, 1, 153, 370,
	 * 371, 407 etc.
	 */
	public static void main(String[] args) {
		isArmStrongExample(153);
	}

	public static void isArmStrongExample(int num) {
		int c = 0, r, temp;
		temp = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			c = c + (r * r * r);
		}
		if (temp == c) {
			System.out.println("armstrong is number");
		} else {
			System.out.println("armstrong is not number");
		}
	}
}