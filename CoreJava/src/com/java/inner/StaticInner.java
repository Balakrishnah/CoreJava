package com.java.inner;
/*It can access static data members of outer class including private.
 Static nested class cannot access non-static (instance) data member or method.*/
public class StaticInner {

	static int data = 30;
	int age =20;
	public static void dispaly(){
		System.out.println("OuterClass Static method");
	}

	
	static class Inner {
		void msg() {
			System.out.println("The data is :" + data);
		}
	}
	
	//If you have the static member(method) inside static nested class, you don't need to create instance of static nested class.
	static class Inner12{
		static void msg(){
			System.out.println("The static method innner "+data);
			dispaly();
		}
	}

	public static void main(String[] args) {
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.msg();
		
		StaticInner.Inner12.msg();

	}

}
