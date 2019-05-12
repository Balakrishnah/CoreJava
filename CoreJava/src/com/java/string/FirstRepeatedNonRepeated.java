package com.java.string;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatedNonRepeated {

public static void firstRepeatedNonRepeatedChar(String str)

{
	HashMap<Character, Integer> charCount=new HashMap<Character, Integer>();
	char ch[]=str.toCharArray();
	for(char c:ch){
		if(charCount.containsKey(c))
		{
			charCount.put(c, charCount.get(c)+1);
		}
		else
			
		{
			charCount.put(c, 1);
		}
	}
	for( char c:ch)
	{
		if(charCount.get(c)==1)
		{
			System.out.println("First Non Repeated Character In '"+str+"' is '"+c+"'");
            
            break;
		}
	}
	
	for(char c:ch)
	{
		if(charCount.get(c)>1){
			System.out.println("First Repeated Character In '"+str+"' is '"+c+"'");
            
            break;
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the string");
Scanner sc=new Scanner(System.in);
String input=sc.next();
firstRepeatedNonRepeatedChar(input);
	}

	
}
