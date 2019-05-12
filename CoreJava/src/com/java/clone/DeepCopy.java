package com.java.clone;

public class DeepCopy {
	/*
	 * 1)We have created a class, Car that has a String field and a getter and
	 * setter method for it. It also has a constructor using its String field.
	 * 2)We have also created a class, Person, that implements the Cloneable
	 * interface in order to override its clone() API method. 
	 * 3)It has a Car field and a String field, getters for both fields and a setter method for the
	 * String field. It also has a constructor using both fields, where it
	 * initializes the Car field with a given String and sets the value of the
	 * String field to another given field. 
	 * 4)We create a new instance of Person and using its getters we get the String field and the String field of its
	 *    Car field.
	 * 5) We also create a clone object, using the clone method of Person.
	 * 6) We change the String field of clone object and the String field
	 *   of Car field of the clone object. Both fields are changed in the clone
	 *   object, whereas the original objects has held its initial values.
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person = new Person("Person-A", "Civic");
		System.out.println("Original Values :" + person.getName() + "--"+ person.getCar().getName());

		Person person2 = (Person) person.clone();
		System.out.println("Clone Before changes: " + person2.getName() + "--"+ person2.getCar().getName());
		person2.setName("Person-B");
		person2.getCar().setName("Accord");

		System.out.println("Clone After Changes: " + person2.getName() + "--"+ person2.getCar().getName());

		System.out.println("Original After clone modified: " + person.getName()	+ "--" + person.getCar().getName());
	}

}
