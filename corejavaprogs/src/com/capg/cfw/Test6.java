package com.capg.cfw;

import java.util.ArrayList;

public class Test6 {
	
	public static void main(String[] args) {
		
		
		
		ArrayList al = new ArrayList();
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		System.out.println(al);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		System.out.println("==========using for loop==============");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("========using foreach loop==========");
		
		for(Object i: al)
		{
			//type casting from Object type to Integer type
			Integer x = (Integer)i;
			if(x%2!=0) {
				System.out.println(x);
			}
		}

		
	}

}
