package com.java.thread;

public class MythreadTwo extends Thread {

	void fun()
	{
		 for(int i=1;i<145;i++){  
			   
		System.out.println(i +"    "+currentThread().getName()); 
				  //try{sleep(500);}catch(InterruptedException e){System.out.println(e);}  
	}
	}
	public void run(){  
        
          fun();
	  } 
			 
	public static void main(String[] args) {
		MythreadTwo t0 = new MythreadTwo();
		MythreadTwo t1 = new MythreadTwo();
		MythreadTwo t2 = new MythreadTwo();
		
	    t0.start();
	   
	    //t0.start();
		/*t0.run();
		t1.run();
		t2.run();*/
		
		
		
		try {
			t0.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.start();
		
		t2.start();
		
		
	}

}
