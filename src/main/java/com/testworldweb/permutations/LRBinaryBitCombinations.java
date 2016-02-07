package com.testworldweb.permutations;

public class LRBinaryBitCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDigitCombinations(4);
	}
	public static void printDigitCombinations(int value)   
	
	{
		for (int i = 0; i < Math.pow(2, value); i++) {
	        StringBuffer binary = new StringBuffer(Integer.toBinaryString(i));
	        for(int j=0;j<binary.length();j++)
	        {
	        	if(binary.charAt(j)=='1')
	        	{
	        		binary.setCharAt(j, 'R');
	        	}
	        	else if(binary.charAt(j)=='0')
	        	{
	        		binary.setCharAt(j, 'L');
	        	}
	        		
	        }
	        for(int j = binary.length(); j < value; j++) {
	            binary.insert( 0, 'L' );
	        }
	        System.out.println(binary);
	    }
	}
}
