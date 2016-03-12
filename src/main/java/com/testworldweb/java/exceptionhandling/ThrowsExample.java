package com.testworldweb.java.exceptionhandling;

public class ThrowsExample {
	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throwOne.");
		
		//throw new IllegalAccessException("demo");
		throw new NullPointerException("demo");
		   
		//String a = null;
	   //System.out.println(a.length());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throwOne();
			} catch (IllegalAccessException e) {
			System.out.println("Caught " + e);
			}
		catch (NullPointerException e) {
			System.out.println("Caught " + e);
			}
			}
	}

