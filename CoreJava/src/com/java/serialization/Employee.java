package com.java.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = -8428831015774109590L;
	 String firstName;
	 static String lastName = "gowda";
	 transient int age;
	 String dept;
	
	public Employee(String firstName, int age, String dept) {
		super();
		this.firstName = firstName;
		this.age = age;
		this.dept = dept;
	}

}
