package com.java.string;

public final class ImmutablePropertyObjEx {

	private final String name;
	private final Age age;

	/*
	 *Next we will see how to avoid changing mutable object in Immutable class. For this we need to change 2 things in our above classes 
		1)In Employee class implements Cloneable and override clone method.
		2)Next in MyImmutableClass class we need to return clone object instead of original Employee Object. 
	 */
	public ImmutablePropertyObjEx(String name, Age age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		Age cloneAge = new Age();
		cloneAge.setDay(age.getDay());
		cloneAge.setMonth(age.getMonth());
		cloneAge.setYear(age.getYear());
		return cloneAge;
	}

	public static void main(String[] args) {
		Age age = new Age();
		age.setMonth(10);
		age.setDay(12);
		age.setYear(1991);
		ImmutablePropertyObjEx propertyObjEx = new ImmutablePropertyObjEx("ranjeet", age);

		System.out.println("Before the set the value "+ propertyObjEx.getAge().getYear());
		propertyObjEx.getAge().setYear(1980);
		System.out.println("After changed the value "+ propertyObjEx.getAge().getYear());
	}

}
