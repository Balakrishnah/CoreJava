package com.java.inner;


public class LocalInner {

	// A class i.e. created inside a method is called local inner class in java.
	// If you want to invoke the methods of local inner class, you must
	// instantiate this class inside the method.
	public static void main(String[] args) {
		LocalInner localInner = new LocalInner();
		localInner.display();
		localInner.displayWithLocalVariable();
		localInner.displayTest();
		
	}

	private int data = 30;

	void display() {
		class Local {
			void msg() {
				System.out.println("The data is: " + data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	void displayWithLocalVariable() {
		final int value = 50;
		class Local1 {
			void message() {
				System.out.println("The value is: " + value);
			}
		}
		Local1 local1 = new Local1();
		local1.message();
	}
	public void displayTest(){
		System.out.println("method started");
		class Local{
			public void msg(){
				System.out.println("Checking the inner class");
			}
		}
		Local local = new Local();
		local.msg();
		System.out.println("method ended");
	}
}