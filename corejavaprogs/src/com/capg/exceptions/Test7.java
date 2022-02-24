package com.capg.exceptions;

import java.util.Scanner;

public class Test7 {

	 public static void main(String[] args) {
		
		 
		 Test6 obj = new Test6();
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter product weight");
		 int weight = s.nextInt();
				 
	    obj.checkProduct(weight);
	}
}
