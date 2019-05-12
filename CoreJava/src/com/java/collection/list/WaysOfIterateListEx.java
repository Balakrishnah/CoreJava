package com.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WaysOfIterateListEx {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Vaibhav");
		nameList.add("Baskar");
		nameList.add("Sachin");
		nameList.add("Babu");
		nameList.add("Pramod");
		nameList.add("Babu");
		System.out.println("****************Traversing List through Iterator***************");
		Iterator< String> it = nameList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("*************Traversing the list through forEach loop********");
		for(String name:nameList){
			System.out.println(name);
		}
		System.out.println("*********Forward Traverse list through ListIterator **********");
		ListIterator<String> listIt = nameList.listIterator();
		while(listIt.hasNext()){
			System.out.println(listIt.next());
		}
		System.out.println("*********Reverse Traverse list through ListIterator **********");
		while(listIt.hasPrevious()){
			System.out.println(listIt.previous());
		}
	}

}
