package com.testworldweb.java.fundamentals;

public class ParseInts {
	public static void main(String[] args) {

		String a="1";
		System.out.println(Integer.parseInt(a));;
		String b="a";
		try
		{
		System.out.println(Integer.parseInt(b));;
		}
		catch(NumberFormatException e)
		{
			
		}
		
		
		char c;
		int x=5;
		c=Character.forDigit(x, 10);
		System.out.println("c="+c);
		System.out.println(8/2);
		System.out.println(8%2);
	}
}
