package com.capg.jse.java8;

public class Test4 implements Left, Right {

	
	public static void main(String[] args) {
		
		
		Test4 obj  = new Test4();
		
		obj.m1();
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
		Right.super.m1();
	}
}
