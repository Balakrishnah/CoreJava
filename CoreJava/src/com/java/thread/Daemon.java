package com.java.thread;

public class Daemon extends Thread 
{
	public void run(){ 
		//System.out.println("Thread is running"); 
		System.out.println("Running Thread name is :"+getName()+" "+"Daemon:"+isDaemon());
		
	}
	public static void main(String[] args) {
		Daemon t0 = new Daemon();
		Daemon t1 = new Daemon();
		Daemon t2 = new Daemon();
	
		
		t2.setDaemon(true);
		
		t0.start();
		
		t1.start();
		t2.start();
		
	}
}
