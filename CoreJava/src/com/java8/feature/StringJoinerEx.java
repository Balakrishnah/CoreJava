package com.java8.feature;

import java.util.StringJoiner;

/*Using this class we can join more than one strings with the specified delimiter, 
 * we can also provide prefix and suffix to the final string while joining multiple strings*/
public class StringJoinerEx {

	public static void main(String[] args) {
		addCountryString();
		addStatePrefixAdSuffix();
		mergingTwoStringjoinerObject();
		stringJoinerUtilityMethods();
	}

	public static void addCountryString() {
		StringJoiner joiner = new StringJoiner("-");
		joiner.add("India");
		joiner.add("America");
		joiner.add("Canada");
		joiner.add("England");
		System.out.println("addCountryString: " + joiner);
	}

	public static void addStatePrefixAdSuffix() {
		StringJoiner joiner = new StringJoiner(",", "{", "}");
		joiner.add("Karnataka");
		joiner.add("Andra pradesh");
		joiner.add("Goa");
		joiner.add("Maharastra");
		System.out.println("addStatePrefixAdSuffix :- " + joiner);
	}

	public static void mergingTwoStringjoinerObject() {
		StringJoiner joiner = new StringJoiner("-", "{", "}");
		joiner.add("KA");
		joiner.add("MH");
		joiner.add("TS");
		joiner.add("AP");
		System.out.println("State code: " + joiner);
		
		StringJoiner stringJoiner = new StringJoiner(",", "pre", "suff");
		stringJoiner.add("Babu");
		stringJoiner.add("PK");
		stringJoiner.add("Ravi");
		stringJoiner.add("Rajeet");
		System.out.println("Name list: " + stringJoiner);
		
		StringJoiner mergedStringJoiner = joiner.merge(stringJoiner);
		System.out.println("Merged String Joiner: " + mergedStringJoiner);
	}

	public static void stringJoinerUtilityMethods() {
		StringJoiner joiner = new StringJoiner(",");
		/*
		 * Using setEmptyValue() method, we can set the default value of a
		 * StringJoiner instance, so if the StringJoiner is empty and we print
		 * the value of it, this default value will be displayed
		 */
		joiner.setEmptyValue("This is a default String");
		System.out.println("First: " + joiner);
		joiner.add("Mango");
		joiner.add("Orange");
		joiner.add("waterMelon");
		System.out.println(" After adding values: " + joiner);

		/*
		 * The length() method of StringJoiner class returns the length of the
		 * string (the number of characters in the StringJoiner instance)
		 */
		int length = joiner.length();
		System.out.println("Length of the StringJoiner: " + length);

		/*
		 * The toString() method is used for converting a StringJoiner instance
		 * to a String.
		 */
		String s = joiner.toString();
		System.out.println(s);
	}
}
