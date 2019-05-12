package com.java.thread;
/*
class Table2{  
	static int i=1;

  synchronized static void showTable(){
		System.out.println(Thread.currentThread().getName());
		// synchronized(this){
	   for(i=1;i<=7;i++){  
	     System.out.println(i +"    "+Thread.currentThread().getName());  
	
			try{Thread.sleep(100);}catch(Exception e){System.out.println(e);}
			  
	   }  
	 // } 
		 } 
	
}
class Threadone extends Thread {

	 Table2 t;
	 Threadone(Table2 t){  
			this.t=t; 
			}
		public void run(){ 
			t.showTable();
			
		}
}

public class Syncronization {

	public static void main(String args[]){  
	Table2 obj = new Table2();//only one object  
	Threadone t0=new Threadone(obj);  
	Threadone t1=new Threadone(obj);  
	
	
		t0.start();  
		t1.start();  
		
		}  
	}  

*/


class Table{  
	
	//void showTable(int n){//method not synchronized  
	//synchronized void showTable(int n){
	synchronized  void showTable(){
		System.out.println(Thread.currentThread().getName());
		//synchronized(this){
	   for(int i=1;i<=10;i++){  
	     System.out.println(i+"      "+Thread.currentThread().getName());  
	     }  
		  
		// }
		
		
	} 

}
public class Syncronization{

	public static void main(String args[]){  
	final Table obj = new Table();//only one object  
	
	Thread t1=new Thread(){  
	 public void run(){  
	 obj.showTable();
	 
	 }  
   };  
   t1.start();  
   
   Thread t2=new Thread(){  
		 public void run(){  
		 obj.showTable();  
		 }  
	   };
	   	t2.start(); 
	   	
	new Thread(){  
		 public void run(){  
			 obj.showTable();  
		 }  
	   }.start();
	     

	   new Thread(){  
			 public void run(){  
				 obj.showTable();  
			 }  
		   }.start();
		   
		 
		}  
	} 
