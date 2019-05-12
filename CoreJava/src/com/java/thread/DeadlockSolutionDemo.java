package com.java.thread;

/*Deadlocks can occur for many different reasons. There is no single recipe to avoid deadlocks. 
 *Normally deadlocks occur when one synchronized object is waiting for lock on resources locked by another synchronized object.
  Try running the below program. This program demonstrates a Deadlock. 
  This deadlock arises because both the threads are waiting for the resources which are grabbed by other thread. They both keep waiting and no one releases.
 */
public class DeadlockSolutionDemo {
	public static Object addLock = new Object();
	public static Object subLock = new Object();

	public static void main(String[] args) {
		MyAdditionThread additionThread = new MyAdditionThread();
		MySubtractionThread subtractionThread = new MySubtractionThread();
		additionThread.start();
		subtractionThread.start();
	}

	private static class MyAdditionThread extends Thread {
		public void run() {
			synchronized (addLock) {
				int a = 10, b = 3;
				int c = a + b;
				System.out.println("Addition Thread: " + c);
				System.out.println("Holding First lock....");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println("Addition thread: waiting for Addlock....");
					synchronized (subLock) {
						System.out.println("Threads: Holding Add and Sub Locks...");
					}
				}
			}
		}
	}

	private static class MySubtractionThread extends Thread {
		public void run() {
			synchronized (addLock) {
				int a = 10, b = 3;
				int c = a - b;
				System.out.println("Subtraction Thread: " + c);
				System.out.println("Holding Second Lock....");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println("Subtraction  Thread: Waiting for SubLock...");
					synchronized (subLock) {
						System.out.println("Threads: Holding Add and Sub Locks...");
					}
				}
			}
		}
	}
}