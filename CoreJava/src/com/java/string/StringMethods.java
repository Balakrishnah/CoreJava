package com.java.string;

public class StringMethods {

	public static void main(String[] args) {
		internEx();
		indexOfExample();
		subStringExample();
		basicExample();		
	}

	/*The java string intern() method returns the interned string. It returns the canonical representation of string.
	  It can be used to return string from memory, if it is created by new keyword. It creates exact copy of heap string object in string constant pool.
	 */
	public static void internEx() {
		System.out.println("---intern example methos started-----");
		String s1 = new String("hello");
		String s3 = s1.intern();
		String s4 = "hello";
		String s5 = s4.intern();
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));
		System.out.println("---intern example methos ended-----");
	}
	
	public static void indexOfExample(){
		System.out.println("---indexOfExample Method started----");
		String s1 = "this is the Index of example";
		System.out.println(s1.indexOf("of"));
		System.out.println("---indexOfExample Method ended----");
	}
	public static void subStringExample(){
		System.out.println("----subStringExample method started---");
		String str = "This is india";
		String str2 = str.substring(2, 4);
		System.out.println(str2);
		String str3 =str.substring(6);
		System.out.println(str3);
		System.out.println("----subStringExample method ended----");
	}
	public static void basicExample(){
		System.out.println("-------basicExample method started-------");
		String s1 = "bala" + "krishna";
		String s5 = "balakrishna";
		String s2 = "bhaskar";
		String s3 = "clover";
		String s4 = "babu@bajajallianz.c.in";
		int a = 20;
		System.out.println(s1.equals(s5));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.trim());
		System.out.println(s1.endsWith("na"));
		System.out.println(s1.startsWith("ba"));
		char c = s3.charAt(4);
		System.out.println(c);
		System.out.println(String.valueOf(a) + 10);
		String s6 = s4.replace("babu", "Balakrishna");
		System.out.println(s6);

		char ch[] = s4.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println(s4.lastIndexOf("@bajajallianz.co.in"));	
		System.out.println("-------basicExample method ended-------");
	}
}
