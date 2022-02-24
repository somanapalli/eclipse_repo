//without lambda expression
package com.capg.jse.java8;

import java.util.ArrayList;
import java.util.Collections;
public class Test7{
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(0);
		l.add(5);
		l.add(20);
		
		System.out.println("before sorting: " + l);
		
		Collections.sort(l,(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
		
		System.out.println("after sorring: " + l);
		
	}

}
