package com.capg.stringapi;

//String comparisions using == operator and equals()
public class Test1 {
	
	
	public static void main(String[] args) {
		
		
		String s1 = "Rama";//scp memory
		
		String s3 = "Rama";
		
		String s2 = new String("Rama");//heap 
		
		String s4 = "rama";
		
		
		
		
		
		System.out.println(s1==s2);//reference  based comparision
		
		System.out.println(s1==s3);//reference based comparision
		
		System.out.println(s1==s4);//false
		
		
		System.out.println(s1.equals(s2));//content based comparision
		
		System.out.println(s2.equalsIgnoreCase(s4));//true
		
		
		
		
	}

}
