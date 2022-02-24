package com.capg.ios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {
	
	public static void main(String[] args) {
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
	    fw = new FileWriter("capg.txt");
		
		 bw = new BufferedWriter(fw);
		
		bw.write("rama");
		bw.newLine();
		bw.write("capg");
		bw.newLine();
		bw.write("vipin");
		bw.newLine();
		bw.write(100);
		System.out.println("data has written successfully");
		
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
		
		finally
		{
			
			try {
				bw.close();
				fw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
