package com.java.oops;

public class DomesticPlan extends Plan {
	// we can not override the instance variable 
	public int count = 200;
	public void display(){
		System.out.println("child");
		count += 150;
		System.out.println(count);
	}
	// super class method has protected and child class method can use public but vice verse not working
	public void show() {
		System.out.println("the child class have public access");
	}
	//default access specifier
	void count() {
		System.out.println("The child class default access specifier");
	}
	
	// changing the return type we can achieve method overriding 
	public DomesticPlan getPlan() {		
		System.out.println(" return the child class type ");
		return null;
	}
	
	public static void m1() {
		System.out.println("child class static method");
	}
	
	public static void main(String[] args) {
		Plan plan = new DomesticPlan();
		plan.display();
		System.out.println("Parent count: "+plan.count);
		DomesticPlan domesticPlan = new DomesticPlan();
		System.out.println("Child Count: "+domesticPlan.count);
		Plan.m1();
		DomesticPlan.m1();
	}
}
