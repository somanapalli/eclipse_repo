package com.capg.ios;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test6 {
	
	public static void main(String[] args) throws Exception{
		
		FileReader fr = new FileReader("capg.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String firstline = br.readLine();
		
		while(firstline!=null)
		{
			System.out.println(firstline);
			firstline = br.readLine();
			
		}
		
		br.close();
		fr.close();
		
		
		
	}

}
