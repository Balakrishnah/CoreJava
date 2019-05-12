package com.java.thread;

public class Myjoin extends Thread {

	void fun() {
		for (int i = 1; i < 120; i++) {
			System.out.println(i + "   " + getName());
			// try{sleep(450);}catch(InterruptedException
			// e){e.printStackTrace();}

		}
	}

	public void run() {

		System.out.println("Run()");
		fun();
	}

	public static void main(String[] args) {

		Myjoin t0 = new Myjoin();
		Myjoin t1 = new Myjoin();
		Myjoin t2 = new Myjoin();

		t0.start();

		try {
			t0.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t1.start();
		t2.start();
	}
}