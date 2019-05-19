package com.java8.feature;

import java.util.stream.Stream;

/* 1)By using streams we can perform various aggregate operations on the data returned from
 *  collections, arrays, Input/Output operations.
 * 2)Parallel execution of operations using stream is faster than sequential execution without using streams.*/
public class StreamAPIEx {

	public static void main(String[] args) {
		iterateAndDispalySelectedInt();
	}

	public static void iterateAndDispalySelectedInt() {
		Stream.iterate(1, count -> count + 1).filter(num -> num % 3 == 0).limit(6)
				.forEach(System.out::println);
	}
}
