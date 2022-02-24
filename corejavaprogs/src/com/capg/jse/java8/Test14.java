package com.capg.jse.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test14 {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("rajini");
		l.add("yash");
		l.add("ramakrishna");
		l.add("saleema");
		l.add("rajitha");
		l.add("pavan");
		l.add("leshv");
		l.add("charv");
		System.out.println(l);
		
		List<String> l2 = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
	    long count = l.stream().filter(s->s.length()==5).count();
		System.out.println(count);
		
		List<String> l3 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("according to default natural sorting order: " + l3);
	
		
		List<String> l4 = l.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
	    System.out.println("in descending order: " + l4);
	    
	}
}
