package com.java.oops;

public class MethodOverloadingExample {
		
	public static void m1(String str){
		System.out.println("Invoke String parameter method");
	}
	
	public static  void m1(Object obj){
		System.out.println("Invoke Object parameter method");
	}
	
	public void m1(int a) {
		System.out.println("Invoke the primitive parameter method");
	}
	
	public static void main(String[] args) {
		MethodOverloadingExample example = new MethodOverloadingExample();		
		m1(null);
		m1(new Integer(5));
		m1(new StringBuffer("abc"));
		example.m1(10);
	}
}