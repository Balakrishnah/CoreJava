package com.java.string;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class ImmutableDateObjEx {
	private final String name;
	private final int age;
	private final Date date;
	private final List<String> nameList;

	public ImmutableDateObjEx(String name, int age, Date date, List<String> names) {
		this.name = name;
		this.age = age;
		this.date = date;
		this.nameList = names;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Date getDate() {
		Date date = new Date(this.date.getTime());
		return date;
	}
	public List<String> getNameList() {
		List<String> namesLst = new ArrayList<String>(this.nameList);
		return namesLst;
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		List<String> names = new ArrayList<String>();
		names.add("babu");
		names.add("Ashok");
		ImmutableDateObjEx ex = new ImmutableDateObjEx("babu", 21, d1,names);
		System.out.println(ex.getDate().hashCode());
		d1.setTime(d1.getTime());
		System.out.println(d1);
		String s1 = ex.getName().concat("abc");
		System.out.println(d1.hashCode());

	}
}