package com.lti.threads;

import java.lang.Thread; //1.develop thread class

public class MyThread extends Thread { // 2.create a class that extends thread
										// and write run method
	public void run() {
		for (int i = 0; i < 3; i++) { // both threads will run 3 times each
			System.out.println("Thread is running");
		}
	}

	public static void main(String[] args) { // 3.create entry point for thread
												// (main method) which can start
												// the thread
		MyThread t1 = new MyThread(); // 4.create instance of thread class
		MyThread t2 = new MyThread();
		t1.start(); // 5.invoke start method on thread obj which in turn invokes
					// run method in thread class
		t2.start(); // won't know which thread executes first because default
					// priority is 5(priority can be changed but there is no
					// guarantee, it depends on the os)

	}

}
