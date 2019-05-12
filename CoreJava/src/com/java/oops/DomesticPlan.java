package com.java.oops;

public class DomesticPlan extends Plan {
	public int count = 200;
	public void display(){
		System.out.println("child");
		count += 150;
		System.out.println(count);
	}

	public static void main(String[] args) {
		Plan plan = new DomesticPlan();
		plan.display();
		
	}
}
