package com.capg.jse.java8;

import java.util.ArrayList;

public class Test15 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(20);
		l.add(45);
		l.add(5);
		l.add(56);
		l.add(78);
		l.add(345);
		
		System.out.println(l);
		//minimum value
		Integer l1 = l.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("minimum value is: : " + l1);
		//maximum value
		Integer l2 = l.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("maximum value is : " + l2);
	}

}
