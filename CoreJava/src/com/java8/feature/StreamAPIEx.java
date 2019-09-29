package com.java8.feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* 1)By using streams we can perform various aggregate operations on the data returned from
 *  collections, arrays, Input/Output operations.
 * 2)Parallel execution of operations using stream is faster than sequential execution without using streams.*/
public class StreamAPIEx {

	public static void main(String[] args) {
		System.out.println("----iterateAndDispalySelectedInt method started----");
		iterateAndDispalySelectedInt();
		System.out.println("----intersectAndUnionFromTwoList method started---");
		intersectAndUnionFromTwoList();
		System.out.println("----convertListToMap method started----");
		convertListToMap();
		System.out.println("--------sortMethodEx method started-------");
		sortMethodEx();
		System.out.println("------anyMatch_AllMatch_NoneMatch method started-------");
		anyMatch_AllMatch_NoneMatch();
		System.out.println("--------primitiveStreamEx method started-------");
		primitiveStreamEx();
		System.out.println("--------reduceAccmulatorEx method started-------");
		reduceAccmulatorEx();
	}

	public static void iterateAndDispalySelectedInt() {
		List<Integer> iterateList = Stream.iterate(1, count -> count + 1).filter(num -> num % 3 == 0).limit(6)
				.collect(Collectors.toList());
		System.out.println("iterateAndDispalySelectedInt is " + iterateList);
	}

	public static void intersectAndUnionFromTwoList() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(4);
		list1.add(7);
		List<Integer> commonDataList = list.stream().distinct().filter(list1::contains).collect(Collectors.toList());
		System.out.println("The Intresect result is :" + commonDataList);
		List<Integer> unionDataList = Stream.concat(list.stream(), list1.stream()).collect(Collectors.toList());
		System.out.println("The Union Result is: " + unionDataList);
	}

	public static void convertListToMap() {
		List<Employee> empList = getEmployeeList();
		List<String> empNameList = empList.stream().map(e -> e.getEname()).collect(Collectors.toList());
		System.out.println("The employee name list: " + empNameList);
		
		Map<Integer, Employee> empMap = empList.stream().collect(Collectors.toMap(e -> e.getEid(), e -> e));
		System.out.println("The employe Object Map: " + empMap);
		
		List<String> cardList = Arrays.asList("Visa", "MasterCard", "American Express", "Visa");
		cardList.stream().map(String::toUpperCase).forEach(System.out::print);
		System.out.println();
		
		Map<String, Integer> map = cardList.stream().collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("The string Map: " + map);
	}

	public static void sortMethodEx() {
		List<Employee> empList = getEmployeeList();
		List<Employee> sortedList = empList.stream().sorted((emp1, emp2) -> emp1.getEid().compareTo(emp2.getEid()))
				.collect(Collectors.toList());
		System.out.println("Print the sorted list " + sortedList);
		long ageCount = empList.stream().filter(e->e.getAge()>29).count();
		System.out.println(" The count of "+ageCount);
	}
	
	public static void anyMatch_AllMatch_NoneMatch() {
		List<Employee> empList = getEmployeeList();
		boolean result = empList.stream().anyMatch(emp->emp.getEname().matches("Ravi"));
		System.out.println("AnyMatch result is :"+result);
		
		result = empList.stream().allMatch(e->e.getEname().matches("Ravi"));
		System.out.println("The AllMatch result is: "+result);
		
		result = empList.stream().noneMatch(e2 ->e2.getEname().matches("Hello"));
		System.out.println("The NoneMatch result is: "+result);
		
		empList.stream().filter(emp->emp.getEname().matches("Bharath")).findFirst().ifPresent(System.out::println);
		
		empList.stream().filter(emp->emp.getEname().matches("Ravi")).findAny().ifPresent(System.out::println);
		
	}
	
	public static void  primitiveStreamEx() {
		LongStream.of(10,20,30).forEach(System.out::println);
		int arr[] = {14,24,65,34,12,32,26};
		Arrays.stream(arr).forEach(System.out::println);		
		Stream<Double> stream = Stream.of(10.0,24.3,35.1,45.4);
		List<Double> doubleList = stream.collect(Collectors.toList());
		System.out.println(doubleList);
	}
	
	public static void reduceAccmulatorEx() {
		Stream.of(10,40,20,58).reduce((x,y)->x+y).ifPresent(System.out::println);
		Stream.of(10,40,20,58).reduce(Integer::sum).ifPresent(System.out::println);
		Stream.of("java","c","C#","python").reduce((x,y)->x+"|"+y).ifPresent(System.out::println);
	}
	
	private static List<Employee> getEmployeeList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(30, "Mahesh", 30));
		empList.add(new Employee(15, "Bharath", 30));
		empList.add(new Employee(20, "Ravi", 30));
		empList.add(new Employee(10, "Chiru", 30));
		empList.add(new Employee(16, "Bharath", 31));
		return empList;
	}
}