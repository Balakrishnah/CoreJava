package com.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		Student s1 = new Student(105, "babu", 28);
		Student s2 = new Student(108, "ravi", 29);
		Student s3 = new Student(100, "Anand", 42);
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Long.compare(o1.getAge(), o2.getAge());
			}
		});
		List<String> list1 = new ArrayList<String>(Arrays.asList("Ranjeet","Teja", "Anand"));
		System.out.println(Collections.max(list1));

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student st = (Student) it.next();
			System.out.println("RollNumber:" + st.getRollNo() + " Name:"+ st.getName() + " age:" + st.getAge());
		}
	}
}