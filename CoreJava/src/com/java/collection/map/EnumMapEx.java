package com.java.collection.map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapEx {
	public enum Days{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	};
	
	public static void main(String[] args) {
		EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
		map.put(Days.MONDAY, "1");
		map.put(Days.TUESDAY, "2");
		map.put(Days.WEDNESDAY, "3");
		map.put(Days.FRIDAY, "4");
		System.out.println(map.keySet());
		System.out.println(map.values());
		for(Map.Entry<Days, String> maps:map.entrySet()){
			System.out.println(maps.getKey()+" "+maps.getValue());
		}
	}
}
