package com.capg.cfw;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	
	
  public static void main(String[] args) {
	
	  ArrayList al = new ArrayList();
	  
	  al.add(100);
	  al.add("rama");
	  al.add(true);
	  al.add(3.4);
	  al.add(null);
	  al.add(100);
	  
	  System.out.println("size is : " + al.size());//size is 6
	  
	  System.out.println("is empty : " + al.isEmpty());
	  
	  System.out.println(al.remove(5));
	  
	  System.out.println(al.remove("rama"));
	  
	  System.out.println("after removing size is : " + al.size());
	  
	  System.out.println("size is:" + al.size());//4
	  
	  System.out.println(al.remove("rama"));//true
	  
	  System.out.println(al.contains("rama"));//false
	  System.out.println(al.contains(3.4));//true
	  
	 // System.out.println(al.get(4));-IndexOutOfBoundsException
	 al.clear();
	 
	 System.out.println("size is: " + al.size());//0
	  
	  
	 // System.out.println(al);//[100,rama,true,3.4,null,100]
	  
	  
}
}
