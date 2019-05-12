package com.java.thread;

public class ThreadImp implements Runnable {
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "  " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		ThreadImp obj = new ThreadImp();
		Thread t0 = new Thread(obj);
		Thread t1 = new Thread(obj);

		t0.start();
		t1.start();
	}
}