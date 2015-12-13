package com.testworldweb.java.sorting;

import java.util.Arrays;

public class MergeSectionsInArray  {

	
	public static int indexUnSort(int a[]) {
		
		for(int i=0;i<a.length;i++)	
		{
			try
			{
				if(a[i]>a[i+1])
					{
					return i+1;
					}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(" No unsort index");
				return -1;
			}
		}
	return 0;
	}
	public static void mergeSections(int a[]) {
		int breakIndex=indexUnSort(a);
		
		int i=0,j=breakIndex,k=0;
		
		//always use if inside while unless indenting pairs 
		while(i<breakIndex && j<a.length)
		{
			if(a[i]>a[j])
			{
				a[k]=a[j];
				j++;
			}
			else
			{
				a[k]=a[i];
				i++;
			}
			k++;
		}
		while(i<breakIndex)
		{
			a[k]=a[i];
			k++;
			i++;
		}
		while(j<a.length)
		{
			a[k]=a[j];
			k++;
			j++;
		}
	}
	public static void main(String[] args) {
		int arr[]={1,4,11,15,22,23,2,3,5,14,21,22,25};
		System.out.println("Array a(length="+arr.length+") "+Arrays.toString(arr));
		
		System.out.println(indexUnSort(arr));
	    //does not work . Contents getting overwritten
		mergeSections(arr);
	    System.out.println("Array a(length="+arr.length+") "+Arrays.toString(arr));
		
	}

	

}
