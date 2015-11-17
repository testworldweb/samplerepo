package com.testworldweb.java.exceptionhandling;

public class UseMyException {
	public static void main(String[] args) throws MyException {
		
		npe();
	
		System.out.println("Hi");
		
	}

public static void npe() throws MyException {
	try
	{
	int a[] = null;
	System.out.println(a.length);
	}
	catch(NullPointerException e)
	{
		throw new MyException();
	}
}

}
