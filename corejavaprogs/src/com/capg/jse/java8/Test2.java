package com.capg.jse.java8;

public class Test2 {
	
	
	public static void main(String[] args) {
		
		
		Runnable r = ()->System.out.println("welcome to run method");
		
		Thread t = new Thread(r);
		
		t.start();
	}

}
