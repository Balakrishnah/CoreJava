package com.java.basic.program;

public class SwapTwoVariableWithoutUsingThridVariable {

	public static void main(String[] args) {
		swapTwoNumberWithoutThirdVariable();
		swapTwoStringWithoutThirdVariable();
	}

	public static void swapTwoNumberWithoutThirdVariable() {
		int x = 30;
		int y = 40;
		y = x + y;
		x = y - x;
		y = y - x;
		System.out.println("values of X:"+x+", Y:"+y);
	}
	public static void swapTwoStringWithoutThirdVariable(){
		String s1 = "Hello";
		String s2 = "World";
		s2 = s1+s2;
		s1 = s2.replace(s1, "");
		s2 = s2.replace(s1, "");
		System.out.println("Values of String s1 :"+s1+", s2:"+s2);		
	}
}
