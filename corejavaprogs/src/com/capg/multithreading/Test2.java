package com.capg.multithreading;

public class Test2 implements Runnable{

	@Override
	public void run() {
		System.out.println("logic executed by : " + Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		
		
		Test2 obj = new Test2();//runnable object
		//convert Runnable object into Thread object
		
		Thread t1 = new Thread(obj);
		
		t1.setName("capg");

		
		t1.start();
		
		
	}

}
