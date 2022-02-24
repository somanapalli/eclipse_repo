package com.capg.multithreading;

public class ThreadB extends Thread {

	//child thread-
	 int total =0;
	 public void run()
	 {
		 synchronized (this) {
			
			 System.out.println("child thrad starts calculation");
			 for(int i=1;i<=100;i++)
			 {
				 total = total+i;
			 }
			 
			 System.out.println("child giving notification");
			 this.notify();
		}
		 
	 }
}
