package com.testworldweb.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisRecCostOfDowntimeRecursiveDP {

	public static void main(String[] args) {
		
		//int [] a = {5,4,3,1000,2}; // cannot use int[] here
		//int [] a = {41,5,13,2,38,22,6,20,7,30,46,10,19,49,40,50,14,37,11,43,12,23}; // cannot use int[] here
		  
		int a[]=new int[500];
		for(int i=0;i<500;i++)
		{
			a[i]=100000-(int)(Math.random()*10);
			System.out.print(" "+a[i]);
			
		}
		System.out.println(" Printed");
		
		long mat[][][]=new long[500][500][501];
		
		System.out.println(mincost(a,0,a.length-1,1, mat));
		
	}
	public static long mincost(int a[],int start,int end,int multiplier,long[][][] mat)
	{
		System.out.println("Start no "+start+" end "+end+" call_no="+multiplier);
		if(mat[start][end][multiplier]!=0)
			return mat[start][end][multiplier];
		
		if(start==end)
			return (multiplier*a[start]);
		long c1=(multiplier*a[start])+mincost(a,start+1,end,multiplier+1, mat);
		long c2=(multiplier*a[end])+mincost(a,start,end-1,multiplier+1, mat);
		
		if(c1<c2)
			{
			mat[start][end][multiplier]= c1;
			return c1;
			}		
		else
		{
			mat[start][end][multiplier]= c2;
			return c2;
		}
	
	}

}