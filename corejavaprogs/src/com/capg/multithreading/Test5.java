package com.capg.multithreading;
//program on join()
public class Test5 extends Thread{

	
	 public void run()
	 {
		 for(int i=1;i<=10;i++)
			{
				System.out.println("seetha thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
	 }
	
	public static void main(String[] args) {
		
		
		Test5 obj = new Test5();//thread created
		obj.start();
		try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("rama thread");
		}
		
	}
}
