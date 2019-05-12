package com.java.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Abac", "babu");
		Collections.unmodifiableMap(hashMap);
		hashMap.put("qwe", "1234");
		System.out.println(hashMap.entrySet());
		List<String> list = new ArrayList<>(hashMap.values());
		System.out.println(list);
		Set<String> set = new HashSet<>(hashMap.values());
		System.out.println(set);
	}

}
