package com.capg.multithreading;

public class Test1 extends Thread {
	
	//our own thread logic can be written inside run() of Thread class
	@Override
	public void run()
	{
		//thread is in running state

		 for(int i=1;i<=10;i++)
		 {
			 System.out.println("executed by " + Thread.currentThread().getName() + "==> " + i);
			 //running state to waiting state
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}
	
	public static void main(String[] args) {
		
		System.out.println("main thread name is: " + Thread.currentThread().getName());
		
		//create your own thread
		
		Test1 obj = new Test1();//thread created-new state
		
		obj.setName("capg");
		
		obj.start();
		
		
	}

}
