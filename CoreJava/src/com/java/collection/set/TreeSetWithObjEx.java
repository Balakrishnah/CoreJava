package com.java.collection.set;

import java.util.TreeSet;

public class TreeSetWithObjEx {

	public static void main(String[] args) {
		TreeSet<Person> personSet = new TreeSet<Person>();
		personSet.add(new Person(20, "Hello"));
		personSet.add(new Person(15, "anil"));
		personSet.add(new Person(30, "babu"));
		
		System.out.println(personSet);
	}

}
