package com.java8.feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectorClassEx {

	public static void main(String[] args) {
		groupingByAndCoutingEx();
		fetchingDataAsList();
		getDataAsMap();
	}
	public static void groupingByAndCoutingEx(){
		List<String> nameList = Arrays.asList("Jon","Ajeet","Steve","Ajeet","Jon","Ajeet");
		Map<String,Long> map = nameList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}
	
	public static void fetchingDataAsList(){
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(10, "babu", 29));
		studentList.add(new Student(15, "Pramod", 25));
		studentList.add(new Student(13, "Mahesh", 27));
		List<String> nameList = studentList.stream().map(m->m.name).collect(Collectors.toList());
		System.out.println("List of names: "+nameList);
		Double avgAge = studentList.stream().collect(Collectors.averagingInt(a->a.age));
		System.out.println("Average age of Student is: "+avgAge);
	}
	
	public static void getDataAsMap(){
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(10, "babu", 29));
		studentList.add(new Student(15, "Pramod", 25));
		studentList.add(new Student(13, "Mahesh", 27));
		Map<Integer, String> studentMap = studentList.stream().collect(Collectors.toMap(Student::getId,Student::getName));
		System.out.println(studentMap);
		
		Comparator<Student> com = Comparator.comparing(Student::getName);		
		Collections.sort(studentList,com);
		System.out.println("Sort by the student age:"+studentList);
	}
}
