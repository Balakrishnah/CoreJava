package com.java.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentRollNoComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRollNo() - o2.getRollNo();
	}
}
class StudentNameComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class CollectionsUtilMethodsEx {

	public static List<Integer> getIntegerValuesList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(46);
		list.add(65);
		list.add(24);
		list.add(10);
		list.add(50);
		return list;
	}

	public static List<String> getStringValuesList() {
		List<String> stringList = new ArrayList<String>();
		stringList.add("aaa");
		stringList.add("fff");
		stringList.add("mmm");
		stringList.add("bbb");
		stringList.add("ddd");
		return stringList;
	}

	public static List<Student> getStudentValuesList() {
		Student student = new Student(20, "babu");
		Student student2 = new Student(30, "ranjeet");
		Student student3 = new Student(10, "lohit");
		List<Student> stringList = new ArrayList<Student>();
		stringList.add(student3);
		stringList.add(student);
		stringList.add(student2);
		return stringList;
	}

	public static void sortCollection() {
		List<String> stringList = getStringValuesList();
		Collections.sort(stringList, Collections.reverseOrder());
		System.out.println("Get the String collections reverse order: "+ stringList);
		List<Student> studentList = getStudentValuesList();

		Collections.sort(studentList,Collections.reverseOrder(new StudentRollNoComparator()));
		System.out.println("Get the Student collections reverse order: "+ studentList);

		Collections.sort(studentList, new StudentNameComparator());
		System.out.println("Get the Student collections ascending order by Name: "+ studentList);	
		
	}

	public static void main(String[] args) {
		sortCollection();
		System.out.println("Get Max values in string list:"	+ Collections.max(getStringValuesList()));
		System.out.println("Get Max values in Integer list:"+ Collections.max(getIntegerValuesList()));

		System.out.println("Get Min values in string list:"	+ Collections.min(getStringValuesList()));
		System.out.println("Get Min values in Integer list:" + Collections.min(getIntegerValuesList()));
	}
}