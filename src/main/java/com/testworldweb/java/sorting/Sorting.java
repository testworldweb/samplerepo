package com.testworldweb.java.sorting;

import java.util.Arrays;

public class Sorting  {

	public static void selectionSort(int arr[] ) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[]={4,2,6,7,1,20,24,3};
		System.out.println(Arrays.toString(a));
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

	

}
