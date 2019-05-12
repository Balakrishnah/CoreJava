package com.java.string;

public class totalNoOccurenceString {
//count the total number of occurrences of a given character in a string 
	//without using any loop?
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="balakrishna Gowda";
		//char c='a';
		int count=s.length()-s.replace("a", "").length();
		System.out.println("totala no of 'a' occurence in given String="+count);
	}

}
