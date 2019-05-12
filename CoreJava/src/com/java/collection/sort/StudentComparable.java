package com.java.collection.sort;

public class StudentComparable implements Comparable<StudentComparable> {
	private int rollNo;
	private String name;
	private int age;
	
	public StudentComparable(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(StudentComparable st) {
		if(age == st.age){
			return 0;
		}else if(age >st.age){
			return 1;
		}else{
			return -1;
		}
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentComparable [rollNo=" + rollNo + ", name=" + name
				+ ", age=" + age + "]";
	}
	
}
