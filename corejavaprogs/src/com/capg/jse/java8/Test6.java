//without lambda expression
package com.capg.jse.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class MyComparator implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2)
	{
		if(i1<i2) {
			return 9;
		}
		else if(i1>i2) {
			return -9;
		}
		else
		{
			return 0;
		}
	}
}
public class Test6 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(0);
		l.add(5);
		l.add(20);
		
		System.out.println("before sorting: " + l);
		
		
		Collections.sort(l,new MyComparator());
		
		System.out.println("after sorring: " + l);
		
	}

}
