package com.java.string;

public class StringBufferMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuffer sb=new StringBuffer("hello");
		sb.append("Balakrishna");
		System.out.println(sb);
		sb.insert(2, "bajaj");
		System.out.println(sb);
		System.out.println(sb.replace(14, 20, "gowda"));
		System.out.println(sb.delete(16, 20));
		System.out.println(sb.reverse());
		

	}

}
