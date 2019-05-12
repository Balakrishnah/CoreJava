package com.java.oops;
class Animal{}
class Dog extends Animal{
	
}
public class InstanceOfExample {
	//The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
	public static void main(String[] args) {
		InstanceOfExample example = new InstanceOfExample();
		System.out.println(example instanceof InstanceOfExample);
		
		//An object of subclass type is also a type of parent class. For example, 
		//if Dog extends Animal then object of Dog can be referred by either Dog or Animal class.
		Dog dog = new Dog();
		System.out.println(dog instanceof Animal);
		System.out.println(dog instanceof Dog);
		Dog dog2 = (Dog) new Animal(); //dowcasting 
		Animal animal = new Dog(); //upcating
		Dog dog3 = null;
		System.out.println(dog3 instanceof Dog);
		
	}

}
