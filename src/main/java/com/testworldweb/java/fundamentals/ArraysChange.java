package com.testworldweb.java.fundamentals;

import java.util.Arrays;

public class ArraysChange {

	
	public static void change(int arr[])
	{
	for(int i=0;i<arr.length;i++)
		{
		arr[i]=arr[i]+1;	
		}
	}	
	public static void main(String[] args) {
	   	
		int arr[]={1,2,3,4,5};

		System.out.println(Arrays.toString(arr));
	    change(arr);
		System.out.println(Arrays.toString(arr));
		

}
}
