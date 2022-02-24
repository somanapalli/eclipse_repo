package com.capg.ios;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int stid;
	private String stname;
	private transient String address;
	
	public Student() {}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int stid, String stname, String address) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.address = address;
	}
	
	
	public String toString()
	{
		return stid + " " + stname + " " + address;
	}
	
	

}
