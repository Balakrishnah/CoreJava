package com.java.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {
	/*
	 * 1)Write a function to check whether two given strings are an Anagram of
	 * each other or not. 
	 * 2)An anagram of a string is another string that contains
	 * the same characters, only the order of characters can be different. For
	 * 3)example, “abcd” and “dabc” are an Anagram of each other.
	 */
	public static void main(String[] args) {
		String str1 = "LISTEN";
		String str2 = "SILENT";
		boolean result = isAnagramUsingHashMap(str1, str2);
		System.out.println("isAnagramUsingHashMap: " + result);
		boolean arrayResult = isAnagramUsingArray(str1, str2);
		System.out.println("isAnagramUsingArray :" + arrayResult);
	}

	public static boolean isAnagramUsingHashMap(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}
		char[] firstChar = str1.toCharArray();
		char[] secondChar = str2.toCharArray();
		Map<Character, Integer> firstMap = new HashMap<Character, Integer>();
		Map<Character, Integer> secondMap = new HashMap<Character, Integer>();
		for (char frist : firstChar) {
			if (firstMap.containsKey(frist)) {
				firstMap.put(frist, firstMap.get(frist) + 1);
			} else {
				firstMap.put(frist, 1);
			}
		}
		for (char second : secondChar) {
			if (secondMap.containsKey(second)) {
				secondMap.put(second, secondMap.get(second) + 1);
			} else {
				secondMap.put(second, 1);
			}
		}
		if (firstMap.equals(secondMap)) {
			return true;
		}
		return false;
	}

	public static boolean isAnagramUsingArray(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] firstChar = str1.toCharArray();
		char[] secondChar = str2.toCharArray();
		Arrays.sort(firstChar);
		Arrays.sort(secondChar);
		for (int i = 0; i < firstChar.length; i++) {
			if (firstChar[i] != secondChar[i]) {
				return false;
			}
		}
		return true;
	}
}
