package com.java.string;

public class RemoveWhiteSpaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void removeWhiteSpace(){
		String str ="Welcome to India";
		char[] ch = str.toCharArray();
		int len = ch.length;
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<len;i++){
			if((ch[i] != ' ') &&(ch[i]!='\t')){
				builder.append(ch[i]);				
			}
		}
		System.out.println(builder.toString());
	}
}
