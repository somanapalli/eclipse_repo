package com.capg.ios;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test7 {
	
	public static void main(String[] args) throws Exception{
		
		
		Student vipin = new Student(100,"vipin","indore");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
		
		oos.writeObject(vipin);
		
		System.out.println("serialization process has done");
		
		oos.close();
		
	}

}
