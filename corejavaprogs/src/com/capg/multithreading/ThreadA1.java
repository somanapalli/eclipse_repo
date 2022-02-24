package com.capg.multithreading;

public class ThreadA1 {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		//main thread
		ThreadB b = new ThreadB();
		
		b.start();
		synchronized (b) {
			System.out.println("main thread calling wait method");
			b.wait();
			System.out.println("main thrread got notification call");
			System.out.println(b.total);//5050,
		}
		
		
		
		//main thread is expecting the updation 
		
		
	}

}
