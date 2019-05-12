package com.java.string;

public class ReverseIteration {

	/**
	 * @param args
	 */
	String reverseString(String str) {
		char ch[] = str.toCharArray();
		String st = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			st += ch[i];

		}
		return st;
	}

	public String reverString(String str) {
		String st ="hello";
		st+= "world";
		System.out.println(st);
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	public static String reverseEach(String str) {
		String words[] = str.split("\\s");
		String reverse = "";
		for (String w : words) {
			StringBuffer sb1 = new StringBuffer(w);
			sb1.reverse();
			reverse += sb1.toString() + " ";
		}
		return reverse;
	}

	public static void main(String[] args) {
		ReverseIteration ri = new ReverseIteration();
		System.out.println(ri.reverseString("balakrishna"));
		System.out.println(ri.reverString("babu"));
		System.out.println(ReverseIteration.reverseEach("java learning"));

	}
}
