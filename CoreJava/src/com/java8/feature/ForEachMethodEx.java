package com.java8.feature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachMethodEx {

	public static void main(String[] args) {
		forEachToIterateMap();
		forEachToIterateList();
		forEachToIterateStream();
	}

	public static void forEachToIterateMap() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Monkey");
		map.put(15, "Dog");
		map.put(20, "Lion");
		map.put(25, "Tiger");
		map.put(5, "Bear");
		System.out.println("forEach to iterate to Map ");
		map.forEach((key, value) -> System.out.println(key + "-" + value));

		map.forEach((key, value) -> {
			if (key == 10) {
				System.out.println("Value Associated with Key 10 is: " + value);
			}
		});

		map.forEach((key, value) -> {
			if ("Dog".equals(value)) {
				System.out.println("Key associated with value Dog is: " + key);
			}
		});
	}

	public static void forEachToIterateList() {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("Mango");
		list.add("Pear");
		list.add("Banana");
		System.out.println();
		System.out.println("Iterate the list using forEach");
		list.forEach((fruit) -> {
			System.out.println(fruit);
		});

		list.forEach((fruit) -> {
			if (fruit.equals("Pear")) {
				System.out.println("Condition value is: " + fruit);
			}
		});
	}

	/*
	 * For sequential streams the order of elements is same as the order in the
	 * source, so the output would be same whether you use forEach or
	 * forEachOrdered. However when working with parallel streams, you would
	 * always want to use the forEachOrdered() method when the order matters to
	 * you, as this method guarantees that the order of elements would be same
	 * as the source.
	 */
	public static void forEachToIterateStream() {
		List<String> nameList = new ArrayList<String>();
		nameList.add("Maggie");
		nameList.add("Michonne");
		nameList.add("Rick");
		nameList.add("Governor");
		System.out.println();
		System.out.println("Iterate the stream using forEachOrdered");
		nameList.stream().forEachOrdered(System.out::println);
		System.out.println("Iterate the stream and filter using forEach");
		nameList.stream().filter(m -> m.startsWith("M")).forEach(System.out::println);
	}
}
