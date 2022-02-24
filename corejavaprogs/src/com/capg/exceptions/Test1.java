package com.capg.exceptions;

public class Test1 {
	
	static
	{
		System.out.println("i am static block");
	}
	{
		System.out.println("i am instance block");
	}
	
	public Test1()
	{
		System.out.println("iam constructor");
	}
	
	public static void main(String[] args) {
		
		Test1 obj = new Test1();
		Test1 obj1 = new Test1();
	
	}

}
