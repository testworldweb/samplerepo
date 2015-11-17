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
public class RuntimeUnchecked {
	public static void main(String[] args) {
		//arithmetic();
		arithmeticCaught();
		//npe();
	//	arrayBounds();
		System.out.println("Hi");
		
	}
public static void arithmetic() {
		
		int a=100;
		int b=0;
		System.out.println(a/b);
		//java.lang.ArithmeticException
	}
public static void npe() {
	
	int a[] = null;
	System.out.println(a.length);
}
public static void arrayBounds() {
	
	int a[] = {4,5,6,7};
	System.out.println(a[4]);
}

public static void arithmeticCaught() {
	
	int a=100;
	int b=0;
	try{
		System.out.println(a/b);	
	}
	catch(java.lang.ArithmeticException e)
	{
		System.out.println(" Caught the exception");
	 e.printStackTrace();
	}
}
}
