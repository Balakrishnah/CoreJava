package com.java.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSortedByValue {

	public static void main(String[] args) {
		Map<String,Integer> hashMap = new HashMap<>();
		hashMap.put("ravi", 28);
		hashMap.put("babu", 27);
		hashMap.put("pramod", 31);
		hashMap.put("ranjeet", 25);		
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String,Integer>>(entrySet);
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for(Entry<String, Integer> entry:list){
			System.out.println(entry.getKey()+"----"+entry.getValue());
		}
	}

}
