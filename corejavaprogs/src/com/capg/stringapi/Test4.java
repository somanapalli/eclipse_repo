package com.capg.stringapi;

public class Test4 {
	
	public static void main(String[] args) {
		
		
		String s1 = "Rama";
		String s2 = "Rama";
		String s3 = "krishna";
		String s4 = "rama";
		
		
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s1.compareTo(s3));//-25
		System.out.println(s3.compareTo(s1));//25
		System.out.println(s1.compareToIgnoreCase(s4));//0
	}
	

}
