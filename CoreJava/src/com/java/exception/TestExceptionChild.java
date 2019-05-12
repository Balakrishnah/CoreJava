package com.java.exception;

public class TestExceptionChild extends Parent {
	 void msg()throws ArrayIndexOutOfBoundsException{  
		    System.out.println("TestExceptionChild");  
		  } 
	 public static void main(String[] args) {
		TestExceptionChild child = new TestExceptionChild();
		child.msg();
	}
}
