package com.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
@SuppressWarnings("finally")
public class ExecutionOfFinallyEx {
	
	public static boolean testFinally(){
		try {
			FileInputStream fileInputStream = new FileInputStream("hello");
		} catch (FileNotFoundException e) {
			System.out.println("Executed Catch block");
			//System.exit(0);
			return false;
		}finally{
			System.out.println("Executed the finally block");
			return true;
		}
	}
	public static void testTryWithoutCatch(){
		try {
			int i = 10/0;
			System.out.println(i);
		}finally{
			System.out.println("Executed the finally block");			
		}
	}
	public static void main(String[] args) {
		boolean test = testFinally();
		System.out.println("output is :"+test);
		testTryWithoutCatch();
	}

}
