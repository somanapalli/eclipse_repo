package com.capg.cfw;

import java.util.ArrayList;

public class Test7 {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		
		//compile time errors: al.adsd("abc");
		
		System.out.println("========using foreach loop==========");
		
		for(Integer i: al)
		{
			
			if(i%2!=0) {
				System.out.println(i);
			}
		}

		
	}

}
