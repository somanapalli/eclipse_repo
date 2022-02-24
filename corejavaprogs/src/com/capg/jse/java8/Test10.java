package com.capg.jse.java8;

import java.util.function.Predicate;

public class Test10 {
	
	public static void main(String[] args) {
		
		
		Predicate<Integer> p = i->i>10;
		
		System.out.println(p.test(78));//true
		System.out.println(p.test(6));//false
		
	}

}
