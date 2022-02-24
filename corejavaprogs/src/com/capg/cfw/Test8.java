package com.capg.cfw;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test8 {
	
	public static void main(String[] args) {
		
		
		HashSet<Student> hs = new HashSet<Student>();
		
		Student vipin = new Student(100,"vipin","indore");
		Student ishika=new Student(101,"ishika","goa");
		Student aadarsh = new Student(102,"aadarsh","chennaih");
		
		 hs.add(vipin);
		 hs.add(ishika);
		 hs.add(aadarsh);
		 
		System.out.println("=====Student names=====");
		for(Student st: hs)
		{
			System.out.println(st.getStname());
		}
	}

}
