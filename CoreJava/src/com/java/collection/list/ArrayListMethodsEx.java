package com.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethodsEx {
	static List<String> nameList = new ArrayList<>();	
	static List<Integer> numList = new ArrayList<>(); 
	static List<String> memberList = new ArrayList<>();
	static {
		nameList.add("Vaibhav");
		nameList.add("Baskar");
		nameList.add("Sachin");
		nameList.add("Babu");
		nameList.add("Pramod");
		nameList.add("Babu");
		
		numList.add(33);
		numList.add(22);
		numList.add(10);
		
		memberList.add("Babu");
		memberList.add("Ravi");
		memberList.add("Chiru");

	}
	
	public static void main(String[] args) {
		memberList.add(1, "Ravikumar");
		System.out.println("Adding String at specific index: "+Arrays.asList(memberList));
		numList.set(1, 19);
		System.out.println("Adding Number at Specific index: "+Arrays.asList(numList));
		nameList.addAll(5, memberList);
		System.out.println("Add all the ArrayList at Specific index: "+Arrays.asList(nameList));
		System.out.println("Name List Size :"+nameList.size());
		
		System.out.println("***********************Index basis*******************************");
		System.out.println("get the element specific Index:"+memberList.get(3));
		System.out.println("Get Index of Specific element: "+nameList.indexOf("Sachin"));
		System.out.println("Get Last index of list: "+nameList.lastIndexOf("Chiru"));
		System.out.println("Get Last index of list: "+nameList.lastIndexOf("Hello"));
		
		System.out.println("*****************************Retain The List*******************");
		nameList.retainAll(memberList);
		System.out.println("Get Common element from both the list: "+Arrays.asList(memberList));
		
		
	}

}
