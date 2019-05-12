package com.java.thread;
public class DeadlockExample {

	public static void main(String[] args) 
	{ 
		
	final String resource1 = "Nikhil";  
	final String resource2 = "Bangalore ";  
	
	Thread t1=new Thread() 
	{  
	public void run() {  
	synchronized (resource1)
	{  
	System.out.println("Thread 1: locked resource 1");  
	
		           try { Thread.sleep(200);} catch (Exception e) {}  
		           synchronized (resource2) {  
			            System.out.println("Thread 1: locked resource 2");  
			           }  
		           
		         }  
		      }  
	};
		  t1.start();
		    // t2 tries to lock resource2 then resource1  
		    
		  Thread t2 = new Thread(){  
		      public void run() {  
		        synchronized (resource1) {  
		          System.out.println("Thread 2: locked resource 1");  
		  
		          try { Thread.sleep(100);} catch (Exception e) {}  
		  
		          synchronized (resource2){  
		            System.out.println("Thread 2: locked resource 2");  
		          }  
		        }  
		      }  
		    };  
		  
		      
		   // t1.start();
		    t2.start();  
		  }  
		}  
		
		
