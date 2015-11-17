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
public class ChangeException {
	public static void main(String[] args) {
		
		try
		{
		npe();
		}
		catch(NullPointerException e)
		{
			System.out.println("Hi1");
				
		}
		System.out.println("Hi");
		
	}

public static void npe() {
	try
	{
	int a[] = null;
	System.out.println(a.length);
	}
	catch(NullPointerException e)
	{
		throw new ArithmeticException();
	}
	
}

}
