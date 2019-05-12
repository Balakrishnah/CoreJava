package com.java.thread;

public class Mythread extends Thread {

	void fun()
	{
	 for(int i=1;i<120;i++){ 
		 System.out.println(i+"   "+getName());  
		 try{sleep(450);}catch(InterruptedException e){e.printStackTrace();}  
			    
			  
	 }
	}		 
	public void run(){  
		
		
		fun();
	}
	public static void main(String[] args) {
						
		Mythread t0 = new Mythread();
		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();
				
		    t0.start();
		   // t0.start();
		    t1.start();
			t2.start();
		
		  //t0.run();
		  //t1.run();
		  //t2.run();
				
			}
		
	}


