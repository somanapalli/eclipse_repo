package com.capg.cfw;

import java.util.HashSet;

public class Test2 {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(100);
		hs.add("rama");
		hs.add("vipin");
		hs.add(3.4);
		hs.add(null);
		hs.add(100);
		
		System.out.println(hs);//[null, vipin, 100, rama, 3.4]
		
		
		
	}

}
