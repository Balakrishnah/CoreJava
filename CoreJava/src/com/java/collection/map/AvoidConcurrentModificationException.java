package com.java.collection.map;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* Its clear that the concurrent modification exception is coming when we call iterator next() function.
    If you are wondering how Iterator checks for the modification, 
    its implementation is present in AbstractList class where an int variable modCount is defined. 
    modCount provides the number of times list size has been changed. 
    modCount value is used in every next() call to check for any modifications in a function checkForComodification().*/
public class AvoidConcurrentModificationException {

	public static void avoidCMEInList() {
		List<String> myList = new CopyOnWriteArrayList<>();
		myList.add("1");
		myList.add("2");

		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println("List values :" + str);
			if (str.equals("2")) {
				myList.remove("2");
				myList.add("3");
				myList.add("4");
			}
		}
		System.out.println("List size is: " + myList.size());
	}

	public static void avoidCMEInMap() {
		Map<String, String> hashMap = new ConcurrentHashMap<String, String>();
		hashMap.put("1", "1");
		hashMap.put("2", "2");
		hashMap.put("3", "3");
		Iterator<String> it = hashMap.keySet().iterator();
		while (it.hasNext()) {
			String value = it.next();
			if (value.equals("2")) {
				hashMap.remove("3");
				hashMap.put("4", "4");
				hashMap.put("5", "5");
			}
		}
		System.out.println("The Map size :" + hashMap.size());
	}

	public static void main(String[] args) {
		avoidCMEInList();
		avoidCMEInMap();
	}

}
