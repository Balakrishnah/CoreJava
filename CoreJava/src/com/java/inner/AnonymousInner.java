package com.java.inner;

	interface SalePerson {
		abstract void eat();
		void test();
	}

public class AnonymousInner {

	public static void main(String[] args) {

		SalePerson salePerson = new SalePerson() {
			
			@Override
			public void eat() {
				System.out.println("Best food for eat");			
			}

			@Override
			public void test() {
				System.out.println("the Test method implementation");
				
			}
		};
		salePerson.eat();
		salePerson.test();
	}
}