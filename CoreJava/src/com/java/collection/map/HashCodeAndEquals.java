package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1,"babu",10);
		Employee emp2 = new Employee(1,"babu",10);
		Map<Employee,String> empMap = new HashMap<>();
		empMap.put(emp1, "hello");
		empMap.put(emp2, "hello");
		System.out.println(empMap.size());
		System.out.println(empMap.entrySet());
		Map<Integer,String> empMap1 = new HashMap<>();
		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		empMap1.put(i, "int");
		empMap1.put(i1, "int");
		System.out.println(empMap1.size());
		System.out.println(empMap1.entrySet());
		
	}
}

