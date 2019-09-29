package com.java.oops;

public  class Plan {
	public int count =100;
	public void display(){
		System.out.println("parent");
	}
	public final void check(){
		System.out.println("Final");
	}
	
	protected void show() {
		System.out.println("the Base class method protected access");
	}
	
	void count() {
		System.out.println(" the base class default access specifier");
	}
	
	public Plan getPlan() {
		System.out.println("return the parent class plan");
		return null;
	}
	
	public static void m1() {
		System.out.println("parent class static method");
	}
}
