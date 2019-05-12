package com.java.string;

public final class Immutable {
	final String name;
	final int regno;
	Immutable(String name, int regno)
	{
		this.name=name;
		this.regno=regno;
	}
	public String getName()
	{
		return name;
	}

	public int regno()
	{
		return regno;
	}
	
	public static void main(String[] args) {
		Immutable im=new Immutable("babu", 12345);
		System.out.println(im.name);
		System.out.println(im.regno);
		Immutable im1=new Immutable("baskar", 4563);
		System.out.println(im1.name);
		System.out.println(im1.regno);
	}
}
