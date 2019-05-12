package com.java.collection.list;

import java.util.Arrays;

public class MyArrayListImpl {
	private Object mystore[];
	private int actSize = 0;

	public MyArrayListImpl() {
		mystore = new Object[10];
	}

	public void add(Object obj) {
		if (mystore.length - actSize <= 5) {
			increaseListSize();
		}
		mystore[actSize++] = obj;
	}

	private void increaseListSize() {
		int newSize = (int) (actSize+0.5*actSize);
		mystore = Arrays.copyOf(mystore, newSize);
		System.out.println("My array length is: " + mystore.length);
	}

	public int size() {
		return actSize;
	}

	public Object remove(int index) {
		if (index < actSize) {
			Object obj = mystore[index];
			mystore[index] = null;
			int temp = index;
			while (temp < actSize) {
				mystore[temp] = mystore[temp + 1];
				mystore[temp + 1] = null;
				temp++;
			}
			actSize--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException("Array index out of exception");
		}
	}

	public Object get(int index) {
		if (index < actSize) {
			return mystore[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public static void main(String[] args) {
		MyArrayListImpl mal = new MyArrayListImpl();
		mal.add(new Integer(2));
		mal.add(new Integer(5));
		mal.add(new Integer(1));
		mal.add(new Integer(23));
		mal.add(new Integer(14));
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.get(i) + " ");
		}
		mal.add(new Integer(29));
		System.out.println("Element at Index 5:" + mal.get(5));
		System.out.println("List size: " + mal.size());
		System.out.println("Removing element at index 2: " + mal.remove(2));
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.get(i) + " ");
		}
	}
}
