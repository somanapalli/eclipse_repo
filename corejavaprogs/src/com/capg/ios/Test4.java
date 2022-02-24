package com.capg.ios;

import java.io.PrintWriter;

public class Test4 {
	
	public static void main(String[] args) throws Exception {
		
		 PrintWriter pw = new PrintWriter("capg.txt");
		 pw.println("rama");
		 pw.println("capg");
		 pw.println("hasan");
		 pw.println("ishika");
		 pw.println(100);
		 pw.println(true);
		 pw.print(5.6f);
		 System.out.println("data has written succesfully");
		 pw.close();
		 
		 
		
	}

}
