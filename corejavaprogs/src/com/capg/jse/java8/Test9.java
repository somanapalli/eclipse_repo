package com.capg.jse.java8;

import java.util.ArrayList;
import java.util.Collections;

public class Test9 {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee(100,"Ram"));
		l.add(new Employee(600,"brunda"));
		l.add(new Employee(400,"tasleem"));
		l.add(new Employee(500,"yash"));
		l.add(new Employee(300,"bindhu"));
		
		System.out.println("before sorting");
		System.out.println(l);
		
		Collections.sort(l,				
		(e1,e2)->(e1.empid<e2.empid)?1:(e1.empid>e2.empid)?-1:0
			);
		
		System.out.println("after sorting");
		System.out.println(l);
		
		
		
		
	}

}
