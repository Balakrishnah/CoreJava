package com.java.string;

import java.util.HashMap;

public class EachRepeatedCharater {

	public static void countChar(String str) {
		HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c) + 1);
			} else {
				charcount.put(c, 1);
			}

		}
		System.out.println(charcount);

		for (char ca : ch) {
			System.out.println(ca + ": " + charcount.get(ca));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EachRepeatedCharater.countChar("Balakrishna Gowda");
	}
}
