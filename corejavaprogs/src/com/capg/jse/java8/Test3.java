package com.capg.jse.java8;

interface Interf1
{
	//logic-default method
	default void m1()
	{
		System.out.println("default methods");
	}
}
public class Test3 implements Interf1{
	
	  
		
		public static void main(String[] args) {
			
			
			Test3 obj = new Test3();
			obj.m1();
		}

}
