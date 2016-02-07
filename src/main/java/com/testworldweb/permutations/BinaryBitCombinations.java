package com.testworldweb.permutations;

public class BinaryBitCombinations {

	public static void main(String[] args) {
		printDigitCombinations(4);
	}
	public static void printDigitCombinations(int value)   
	
	{
		for (int i = 0; i < Math.pow(2, value); i++) {
	        StringBuffer binary = new StringBuffer(Integer.toBinaryString(i));

	        for(int j = binary.length(); j < value; j++) {
	            binary.insert( 0, '0' );
	        }
	        System.out.println(binary);
	    }
	}
}
