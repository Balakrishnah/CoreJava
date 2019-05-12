package com.java.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		testTreeMap();
		testTreeMapWithObject();
	}
	public static void testTreeMapWithObject(){
		Employee emp =new Employee(15, "Baharath", 50000);
		Employee emp1 =new Employee(20, "Vaibhav", 30000);
		Employee emp2 =new Employee(10, "Ail", 20000);
		Map<Employee, Employee > empMap = new TreeMap<Employee, Employee>();
		empMap.put(emp, emp);
		empMap.put(emp1, emp1);
		empMap.put(emp2, emp2);
		Set<Entry<Employee, Employee>> empEntry = empMap.entrySet();
		Iterator<Entry<Employee, Employee>> itEmp = empEntry.iterator();
		while (itEmp.hasNext()) {
			Entry<Employee, Employee> employee = itEmp.next();
			Employee empKey = employee.getKey();
			Employee empValue = employee.getValue();
			System.out.println("Key is :" + empKey + " Values is :"+ empValue);
		}
	}
	public static void testTreeMap() {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(30, "Virat");
		treeMap.put(10, "Sachin");
		treeMap.put(20, "Anil");
		Set<Entry<Integer, String>> treeMapEntry = treeMap.entrySet();
		Iterator<Entry<Integer, String>> it = treeMapEntry.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println("Key is :" + entry.getKey() + " Values is :"+ entry.getValue());
		}
	}

}
