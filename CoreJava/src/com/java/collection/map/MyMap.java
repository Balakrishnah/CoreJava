package com.java.collection.map;

//Reference link: https://www.javamadesoeasy.com/2015/02/hashmap-custom-implementation.html
public class MyMap<K, V> {
	private Entry<K, V>[] buckets;
	private static final int INTIAL_CAPACITY = 1 << 4;

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	@SuppressWarnings("unchecked")
	public MyMap(){
		buckets = new Entry[INTIAL_CAPACITY];
	}
}
