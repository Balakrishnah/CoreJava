package com.java.thread;

public class MyThreadPriority extends Thread {
	
 void fun()
{
	System.out.println("Running Thread name is :"+getName()+" "+"That Thread Priority:"+getPriority());
	for(int i=1;i<=55;i++){  
		System.out.println(i +"   "+getName());
		  	      	
}
}
	public void run(){ 
		System.out.println("run()"); 
		fun();
		}
	
	public static void main(String[] args) {
		MyThreadPriority t0 = new MyThreadPriority();
		MyThreadPriority t1 = new MyThreadPriority();
		MyThreadPriority t2 = new MyThreadPriority();
	
		
		t2.setPriority(Thread.MAX_PRIORITY);
		t0.setPriority(Thread.MIN_PRIORITY);
		
		t0.start();
		t1.start();
		t2.start();
		
	}

}


