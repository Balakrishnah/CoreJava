package com.java.thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class WorkerThread implements Runnable {  
		    private String request;  
		    public WorkerThread(String s){  
		        this.request=s;  
		    }  
	
	    public void run() {  
		        System.out.println(Thread.currentThread().getName()+" (Start) request = "+request);  
	        processrequest();  
		        System.out.println(Thread.currentThread().getName()+" (End)");  
	    }  
	
		    private void processrequest() {  
		    	/*int a=5,b;
		    	for(int i=0;i<5;i++)
		    	{
		    		b=a*i;
		    		System.out.println(b);
		    	}*/
	        try {  Thread.sleep(200);  } catch (InterruptedException e) { e.printStackTrace(); }  
	    }  
	}  
	
public class Threadpooling {

	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);  
			        for (int i = 1; i < 10; i++) {  
			            Runnable worker = new WorkerThread("" + i);  
			            executor.execute(worker);  
			          } 
			          
			        executor.shutdown();  
			    while (!executor.isTerminated()) {  
			        
		        	   }
			  
			     //  System.out.println("Finished all threads");  
			 
		
	}

}

