package com.capg.accessmodifiers;

public class Test1 {

	 protected int x=100;
	  protected void display()
	 {
		 System.out.println("protected value is: " + x);
	 }
	 
	 public static void main(String[] args) {
		
		 Test1 obj = new Test1();
		 obj.display();
	}
}
