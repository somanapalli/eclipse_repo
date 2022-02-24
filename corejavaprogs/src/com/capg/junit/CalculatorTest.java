package com.capg.junit;

import  static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private static Calculator obj = null;
	
	@BeforeAll
	public static void init()
	{
		obj = new Calculator();
	}
	
	
	@AfterAll
	public static void destroy()
	{
		obj = null;
	}

	
	
	@Test
	void testAdd() {
		
		
		
		int actualResult = obj.add(20,30);
		int expectedResult = 50;
		
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testMul() {
		
		
		int actualResult = obj.mul(20,30);
		int expectedResult = 600;
		
		assertEquals(expectedResult,actualResult);
		
	}
	
	
}
