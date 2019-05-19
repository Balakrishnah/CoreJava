package com.java.oops;

public class MethodOverloadingExample {
		
	public static void m1(String str){
		System.out.println("Invoke String parameter method");
	}
	
	public static void m1(Object obj){
		System.out.println("Invoke Object parameter method");
	}
	
	public static void main(String[] args) {
		m1(null);
	}
}