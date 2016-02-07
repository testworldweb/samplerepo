package com.testworldweb.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisRecCostOfDowntimeRecursive {

	public static void main(String[] args) {
		
		//int [] a = {5,4,3,1000,2}; // cannot use int[] here
		//int [] a = {41,5,13,2,38,22,6,20,7,30,46,10,19,49,40,50,14,37,11,43,12,23}; // cannot use int[] here
		  
		int a[]=new int[50];
		for(int i=0;i<50;i++)
		{
			a[i]=100000;
		}
		
		System.out.println(mincost(a,0,a.length-1,1));
		
	}
	public static long mincost(int a[],int start,int end,int multiplier)
	{
		System.out.println("call_no="+multiplier);
		if(start==end)
			return (multiplier*a[start]);
		long c1=(multiplier*a[start])+mincost(a,start+1,end,multiplier+1);
		long c2=(multiplier*a[end])+mincost(a,start,end-1,multiplier+1);
		if(c1<c2)
			return c1;
		else
		return c2;
	}

}