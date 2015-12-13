package com.testworldweb.java.sorting;

import java.util.Arrays;

public class MergeSectionsInArrayV2  {

	/**
	 * 
	 * @param a
	 * @param start the index of the first element which is to be moved
	 * @param end  the index of the last element which is to be moved
	 */
	public static void shiftRight(int a[],int start , int end){
		
		if(end>=a.length || end<start ) // usually and conditions happen in while
			System.out.println("Cannot shift");
		for(int i=end;i>=start;i--)
		{
			a[i+1]=a[i];
		}
	}
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
		
		while(i<breakIndex && j<a.length)
		{
			if(a[i]>a[j])
			{
				int temp=a[j];
				shiftRight(a,k,j-1);
				a[k]=temp;
				j++;
				i++;
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
		int arr[]={1,4,11,15,22,24,2,3,5,14,21,23,25};
		System.out.println("Array a(length="+arr.length+") "+Arrays.toString(arr));
		
		System.out.println(indexUnSort(arr));
	    //does not work . Contents getting overwritten
		mergeSections(arr);
	    System.out.println("Array a(length="+arr.length+") "+Arrays.toString(arr));
		
	}

	

}
