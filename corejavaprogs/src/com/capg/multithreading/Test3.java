package com.capg.multithreading;

public class Test3 extends Thread{

	//logic can be executed by my own thread
	public void run()
	{

		 for(int i=1;i<=10;i++)
		 {
			 System.out.println("executed by " + Thread.currentThread().getName() + "==> " + i);
			 //running state to waiting state
			 try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}
	 public static void main(String[] args) {
		
		 
		 
		 Test3 obj = new Test3();
		 obj.setName("capg");
		 obj.setPriority(Thread.MIN_PRIORITY);
		 obj.start();
		// obj.start();
		 
		 Test3 obj1 = new Test3();
		 obj1.setPriority(Thread.MAX_PRIORITY);
		 obj1.setName("ibm");
		 obj1.start();
		// obj1.start();
	}
}
