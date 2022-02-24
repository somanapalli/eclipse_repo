package com.capg.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		try {
			Scanner s = new Scanner(System.in);

			System.out.println("enter first number");
			int x = s.nextInt();

			System.out.println("enter second number");
			int y = s.nextInt();

			// logic-division
			int z = x / y;

			System.out.println("division is : " + z);
		}

		catch (ArithmeticException ae) {
			System.out.println("don't enter zero as a denominator");
		} catch (InputMismatchException ie) {
			System.out.println("please pass only numerics");
		} catch (Exception e) {
			System.out.println(e);
		}

		 //case 2: System.exit(0);
		finally {
			//case 1: System.out.println(3/0);
			System.out.println("iam from finally block");
			
		    //case 3:  return;
			
		}
	

		System.out.println("Rest of the statements executed");

	}

}
