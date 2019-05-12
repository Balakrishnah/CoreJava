package com.java.thread;


class Table1{  
	
	static int i=1;
	 
	 synchronized static  void showTable(){
	System.out.println(Thread.currentThread().getName());
	
		  //synchronized(this){
	   for( i=1;i<8;i++){  
	     System.out.println(i+"      "+Thread.currentThread().getName());  
	     try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
	   } 
	// }
			
	} 

}

public class MySyncron{

	public static void main(String args[]){  
	final Table1 obj = new Table1();//immutable object  
	
	Thread t0=new Thread()
	{
	public	void run()
		{
		   obj.showTable();
		}
	};
		t0.start();  
		
		Thread t1=new Thread()
		{
		public	void run()
			{
			   obj.showTable();
			}
		};
		
		t1.start(); 
		
	/*new Thread()
		{
		public	void run()
		{
		   obj.showTable();
		}
		
		}.start();
		
		
		
		new Thread()
		{
		public	void run()
			{
			   obj.showTable();
			}
		}.start();
		*/
		  
	
		 
		}  
	}  
