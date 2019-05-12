package com.java.collection.sort;

import java.util.ArrayList;

public class ComparableTest {

	
	public static void main(String[] args) {		
	ArrayList<StudentComparable> compareList = new ArrayList<StudentComparable>();
    compareList.add(new StudentComparable(100, "Babu", 20));
    compareList.add(new StudentComparable(50, "Madu", 13));
    System.out.println(compareList.toString());
	}

}
