package com.java.inner;

	/*1)Nested interface must be public if it is declared inside the interface 
	    but it can have any access modifier if declared within the class.
	  2)Nested interfaces are declared static implicitly.*/
	interface Showable {
		void show();
	
		interface Message {
			void msg();
		}
	}

	public class NestedInterface implements Showable.Message{

		@Override
		public void msg() {
			System.out.println("Hello nested interface");
		}
	

	public static void main(String[] args) {
		Showable.Message message = new NestedInterface();
			message.msg();

	}

}
