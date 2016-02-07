package com.testworldweb.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisRecCostOfDowntime {

	public static void main(String[] args) {
		
		Integer[] a = {5,4,3,1000,2}; // cannot use int[] here
		List<Integer> intList = Arrays.asList(a);
		printDigitCombinations(a);
	}
	public static void printDigitCombinations(Integer[] a)   
	
	{
		long minSum=Long.MAX_VALUE;String finalSequence="";
		for (int i = 0; i < Math.pow(2, a.length); i++) {
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
	        for(int j = binary.length(); j < a.length; j++) {
	            binary.insert( 0, 'L' );
	        }
	    
	        
	       
	      long sum=  costOfCombination(a,binary);
	        
			if(sum<minSum)
			{
				minSum=sum;
				finalSequence=binary.toString();
			}
			
		}
		System.out.println("----The Final Cost is----"+minSum);
		System.out.println("----The Final Cost is----"+finalSequence);
	}
	public static long costOfCombination(Integer[] a,StringBuffer binary)
	{
		
		  List<Integer> intList = new ArrayList<Integer>();
		    for (int index = 0; index < a.length; index++)
		    {
		        intList.add(a[index]);
		    }
		long sum=0;
		
		for(int i=0,costMul=1;i<binary.length();i++,costMul++)
		{Integer temp = null;
			if(binary.charAt(i)=='L')
			{
				 temp=intList.remove(0);
			}
			if(binary.charAt(i)=='R')
			{  int tempSize=intList.size();
				 temp=intList.remove(tempSize-1);
			}
			sum+=(temp*costMul);
	
		}
		System.out.println("Cost of Combination "+ binary+ " is "+ sum);
		return sum;
	}
	
	
}
