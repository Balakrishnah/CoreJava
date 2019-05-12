package com.java.thread;

 class Mythread1 extends Thread
 {

	void fun1()
	{
		 for(int i=100;i<200;i++){  
			   
				    System.out.println(i +"    "+currentThread().getName()); 
				//   try{sleep(500);}catch(InterruptedException e){System.out.println(e);}  
	}
	}
   public void run(){  
		         //  System.out.println("run()");
		           fun1();
			  } 
 }
 
 
 class Mythread2 extends Thread
 {

	void fun2()
	{
		 for(int i=200;i<300;i++){  
			   
				    System.out.println(i+" "+currentThread().getName()); 
				//   try{sleep(500);}catch(InterruptedException e){System.out.println(e);}  
	}
	}
   public void run(){  
		         //  System.out.println("run()");
		           fun2();
			  } 
 }
 
 class Mythread3 extends Thread
 {

	void fun3()
	{
		 for(int i=300;i<400;i++){  
			   
				    System.out.println(i +"  "+currentThread().getName()); 
				//   try{sleep(500);}catch(InterruptedException e){System.out.println(e);}  
	}
	}
   public void run(){  
		         //  System.out.println("run()");
		           fun3();
			  } 
 }
 
public class ThreadTest {

	public static void main(String[] args) {
		Mythread1 t1 = new Mythread1();
		Mythread2 t2= new Mythread2();
		Mythread3 t3= new Mythread3();
		t1.start();
		t2.start();
		t3.start();
	}

}
