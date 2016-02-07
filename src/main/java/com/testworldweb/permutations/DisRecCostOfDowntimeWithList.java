package com.testworldweb.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisRecCostOfDowntimeWithList {

	public static void main(String[] args) {
		
		//Integer[] a = {5,4,3,1000,2}; // 
		//List<Integer> intList = Arrays.asList(a);
		
		
		Integer[] a = {41,5,13,2,38,22,6,20,7,30,46,10,19,49,40,50,14,37,11,43,12,23}; // 
		List<Integer> intList = Arrays.asList(a);
	
		/*List<Integer> intList=new ArrayList<Integer>();
		for(int i=0;i<1000;i++)
		{
			if(i==797)
			{
				intList.add(99999);
			}
			else
			{	
			intList.add(100000);
			}
		*/
		
		printDigitCombinations(intList);
	}
	public static void printDigitCombinations(List<Integer> myList)   
	
	{
		long minSum=Long.MAX_VALUE;String finalSequence="";
		for (int i = 0; i < Math.pow(2, myList.size()); i++) {
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
	        for(int j = binary.length(); j < myList.size(); j++) {
	            binary.insert( 0, 'L' );
	        }
	    
	        
	       
	      long sum=  costOfCombination(myList,binary);
	        
			if(sum<minSum)
			{
				minSum=sum;
				finalSequence=binary.toString();
			}
			
		}
		System.out.println("----The Final Cost is----"+minSum);
		System.out.println("----The Final Cost is----"+finalSequence);
	}
	public static long costOfCombination(List<Integer> myList,StringBuffer binary)
	{
		
		  List<Integer> intList = new ArrayList<Integer>();
		    for (int index = 0; index < myList.size(); index++)
		    {
		        intList.add(myList.get(index));
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
