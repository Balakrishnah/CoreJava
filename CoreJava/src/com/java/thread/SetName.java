package com.java.thread;

public class SetName extends Thread {

	public void run(){ 
		//System.out.println("Thread is running"); 
		System.out.println("Name of Thread:"+getName());
		
	}
	public static void main(String[] args) {
		SetName t0 = new SetName();
		SetName t1 = new SetName();
		SetName t2 = new SetName();
	
		System.out.println("Name of t0:"+t0.getName());
		System.out.println("Name of t1:"+t1.getName());
		System.out.println("Name of t2:"+t2.getName());
		
		t1.setName("umapath1"); 
		t2.setName("Nikhil");
		
		t0.start();
		
		t1.start();
		t2.start();
	
	//System.out.println("After changing name of t1:"+t1.getName());  

	}

}
