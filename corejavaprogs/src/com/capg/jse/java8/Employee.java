package com.capg.jse.java8;

public class Employee {
	
	
    int empid;
	String empname;
	
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return  empid + " " + empname;
	}
	
	public Employee()
	{
		
	}

}
