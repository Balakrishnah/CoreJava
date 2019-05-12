package com.java.string;

public class CapitalizeEachWordEx {

	public static String capitalizeEachWord(String str){
		String[] words = str.split(" ");
		String capitalizeString ="";
		for(String word:words){
			String first = word.substring(0,1);
			String afterFirst =word.substring(1);
			capitalizeString = capitalizeString+first.toUpperCase()+afterFirst.toLowerCase();
		}
		return capitalizeString;
	}
	public static void main(String[] args) {
		System.out.println(capitalizeEachWord("this name"));
	}

}
