package com.testworldweb.java.sorting;

import java.util.Arrays;

public class MergeArrays  {

	public static int[] merge(int a[],int b[]) {
		int[] c=new int[a.length+b.length];
		
		int i=0,j=0,k=0;
		//easier to use while loop over for if there are variations in termination condition or incremental condition
		//while over for
		
		 // 	while(i<a.length || j<b.length) // or is incorrect in this case
		while(i<a.length && j<b.length)	{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else
			{
				c[k]=b[j];
				j++;
			}
			k++;
		}
		if(i<a.length)
		{
			while(i<a.length)
			{
				c[k]=a[i];
				i++;
				k++;
			}
		}
		else if(j<b.length)
		{
			while(j<b.length)
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		int a[]={1,4,11,15,22,23};
		System.out.println("Array a(length="+a.length+") "+Arrays.toString(a));
		
		int b[]={2,3,5,14,21,22,25};
		System.out.println("Array b(length="+b.length+") "+Arrays.toString(b));
		
		int[] c=merge(a,b);
		System.out.println(Arrays.toString(c));
	}

	

}
