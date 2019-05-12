package com.java.thread;

class Thread0 extends Thread
{
	int sum;
	int fun1(int n)
	{
	 
	sum=sum+n;
	 for(int i=1;i<120;i++){ 
		 System.out.println(i+"   "+getName());  
		 // try{sleep(450);}catch(InterruptedException e){e.printStackTrace();}  
			    
			  
	 }
	return sum;
	}
public void run(){  
		
	int b	=fun1(10);
	 for(int i=1;i<120;i++){ 
		 System.out.println(i+"   "+getName());  
		 // try{sleep(450);}catch(InterruptedException e){e.printStackTrace();}  
			    
			  
	 }
	System.out.println("Addition"+b);
	}
}


class Thread1 extends Thread
{
	int mul=10;
	int fun2(int x)
	{
	
		mul=mul*x;
		return mul;
	}
public void run(){  
		
	int m=	fun2(20);
	 for(int i=1;i<120;i++){ 
		 System.out.println(i+"   "+getName());  
		 // try{sleep(450);}catch(InterruptedException e){e.printStackTrace();}  
			    
			  
	 }
	System.out.println("Multiplay"+m);
	}
}

class Thread2 extends Thread
{
	int a=12,b=5,c;
	int fun3()
	{
	
		c=a/b;
		 for(int i=1;i<120;i++){ 
			 System.out.println(i+"   "+getName());  
			 // try{sleep(450);}catch(InterruptedException e){e.printStackTrace();}  
				    
				  
		 }
		return c;
	}	

public void run(){  
		
		int d=fun3();
		System.out.println("Division"+d);
	}
}
public class MythreadOne 
{
	
	public static void main(String[] args) {
						
		Thread0 t0 = new Thread0();
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
			
	
		
		   t0.start();
		
				t1.start();
				
				t2.start();
				
			}
		
	}

