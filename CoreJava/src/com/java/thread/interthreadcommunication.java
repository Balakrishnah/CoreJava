package com.java.thread;
class Customer{  
	int balance=10000;  
	
	synchronized void withdraw1(int amount){  
	System.out.println("going to withdraw1...");  
	  
	if(balance<amount){  
	System.out.println("Less balance; waiting for deposit...");  
	try{wait();}catch(Exception e){}  
	}  
	//balance-=amount; 
	balance=balance - amount;
	System.out.println("withdraw1 completed..."+" Balance amount:"+balance );  
	}  
	synchronized void withdraw2(int amount){  
		System.out.println("going to withdraw2...");  
		  
		if(balance<amount){  
		System.out.println("Less balance; waiting for deposit...");  
		try{wait();}catch(Exception e){}  
		}  
		balance-=amount;  
		System.out.println("withdraw2 completed..."+"amount:"+balance);  
		}   
	
	synchronized void deposit(int amount){  
	System.out.println("going to deposit...");  
	//balance+=amount; 
	//try{Thread.sleep(400);}catch(Exception e){}  
	
	balance=balance + amount; 
	System.out.println("deposit completed... ");  
	notifyAll();  
	}  
	}  


public class interthreadcommunication {
	public static void main(String[] args) {

		final Customer c=new Customer();  

		Thread t1 =new Thread(){
			public void run(){
				c.withdraw1(15000);
				
			}
		};
		
		t1.start();
		
		
			Thread t2=new Thread(){  
		public void run(){
			c.withdraw2(15000);
			}  
		}; 
		
		t2.start();
		
		Thread t3 =new Thread(){
			public void run(){
				c.deposit(30000);
				
			}
		};
		
		t3.start();
		 

		
	}

}


