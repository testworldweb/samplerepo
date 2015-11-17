package com.testworldweb.java.exceptionhandling;
/**
 * Demonstration of Runtime expections 
 * 1.NullPointerException
 * 2.ArrayIndexOutOfBoundsException
 * 3.ArithmeticException
 * 
 * And 
 * 1.Catching the exception to continue program flow
 * 2.Printing stacktrace of exception
 */
public class FinallyExample1 {
	public static void main(String[] args) {
		try
		{
		arithmetic();
		}

		catch(ArithmeticException e)
		{
			System.out.println("1");
		}
		catch(Exception e)
		{
			System.out.println("2");
		}
		finally
		{
			System.out.println("3");
		}
		System.out.println("4");
		
	}
public static void arithmetic() {
		
		int a=100;
		int b=10;
		System.out.println(a/b);
		
	}
}
