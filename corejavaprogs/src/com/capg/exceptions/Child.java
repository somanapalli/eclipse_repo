package com.capg.exceptions;

import java.io.IOException;

public class Child extends Parent{

	/*case1 : invalid
	 * @Override public void sum(int x, int y) throws IOException {
	 * System.out.println("sum is: " + (x+y)); }
	 */
	
	/*
	 * @Override public void sum(int x, int y) throws RuntimeException {
	 * System.out.println("sum is: " + (x+y)); }
	 */
	/*
	 * @Override public void sum(int x, int y) throws ArithmeticException {
	 * System.out.println("sum is: " + (x+y)); }
	 */
	
	/*
	 * @Override public void sum(int x, int y) { System.out.println("sum is: " +
	 * (x+y)); }
	 */
	/*invalid
	 * public void sum(int x, int y) throws Exception {
	 * System.out.println("sum is: " + (x+y)); }
	 */
	
	
	
}
