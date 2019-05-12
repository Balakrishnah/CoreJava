package com.java.inner;

public class MemberInner {
	private int data =30;
	class Inner{
		void msg(){
			System.out.println("Data is :"+data);
		}
	}

	public static void main(String[] args) {
		MemberInner inner = new MemberInner();
		MemberInner.Inner  inner2 = inner.new Inner();
		inner2.msg();
	}

}
