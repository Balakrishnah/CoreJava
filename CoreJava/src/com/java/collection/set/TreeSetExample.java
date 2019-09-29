package com.java.collection.set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		customObjectEx();
		sampleTreeSetEx();
	}

	public static void customObjectEx() {
		TreeSet<Person> personSet = new TreeSet<Person>();
		personSet.add(new Person(20, "hello"));
		personSet.add(new Person(15, "anil"));
		personSet.add(new Person(30, "babu"));
		personSet.add(new Person(30, "babu"));
		System.out.println(personSet);
		System.out.println("Custom treeset size : "+personSet.size());
	}
	
	public static void sampleTreeSetEx() {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(21);
		treeSet.add(15);
		treeSet.add(18);
		System.out.println(treeSet);
	}
}
