package com.java.collections.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUnmodifiableListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, "Google","yahoo","mozila");
		List<String> list2 = Collections.unmodifiableList(list);		
		System.out.println("Unmodifiable List :"+list2);
		list.add("safari");
		System.out.println(list2);
		list2.add("ITC");
	}

}
