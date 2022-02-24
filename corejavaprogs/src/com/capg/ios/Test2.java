package com.capg.ios;

import java.io.FileWriter;

public class Test2 {
	
	public static void main(String[] args) throws Exception{
		
		//create the FileWriter object
		
		FileWriter fw =new FileWriter("capg.txt");
		
		//writing the data
		
		fw.write("rama\n");
		fw.write("krishna\n");
		fw.write("vipin\n");
		fw.write("ishika\n");
		fw.write("hasan\n");
		
		fw.write(100);
		
		
		System.out.println("data written successfully");
		
		//close the file
		fw.close();
	}

}
