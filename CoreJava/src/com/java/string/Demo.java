package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void nonRepeat(String arr) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char ch[] = arr.toCharArray();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (char cr : ch) {
			if (map.get(cr) == 1) {
				System.out.println("first non repeated: " + cr);
			}
			if (map.get(cr) > 1) {
				System.out.println(cr + " count of: " + map.get(cr));
			}

		}
	}

	public static void test() {
		String s1 = new String("xyz");
		System.out.println("s1 hascode -----: " + s1.hashCode());
		String s2 = "xyz";
		System.out.println("s2 hascode -----: " + s2.hashCode());
	}

	public static void main(String[] args) {
		nonRepeat("hello Java");
		test();
	}
}
