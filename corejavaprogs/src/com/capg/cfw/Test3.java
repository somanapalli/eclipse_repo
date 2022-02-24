package com.capg.cfw;

import java.util.TreeSet;

public class Test3 {
	
	public static void main(String[] args) {
		
		
		TreeSet ts = new TreeSet();
		
		ts.add(100);
		ts.add(45);
		ts.add(-5);
		ts.add(67);
		ts.add(23);
		ts.add(77);
		ts.add(9);
		
		//ts.add(null);-NullPointerException
		
		
		System.out.println(ts.first());//-5
		System.out.println(ts.last());//100
		
		System.out.println(ts.headSet(45));//[-5, 9, 23]
		
		System.out.println(ts.tailSet(45));//[45, 67, 77, 100]
		
		System.out.println(ts.subSet(23,77));//[23, 45, 67]
		
		
		System.out.println(ts);//[-5, 9, 23, 45, 67, 77, 100]
		System.out.println(ts.descendingSet());
	
	}

}
