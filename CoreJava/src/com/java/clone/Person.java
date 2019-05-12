package com.java.clone;

public class Person implements Cloneable {
	private Car car;
	private String name;

	public Person(String t, String name) {
		this.car = new Car(t);
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person person = new Person(name, car.getName());
		return person;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}