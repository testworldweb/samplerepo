package com.testworldweb.java.fundamentals;

import java.util.Arrays;

public class ArraysCopyContructor {

	

	public static void main(String[] args) {
	   	
		int arr[]={1,0,0,1,0,0,1,0};
		//creates another refernce of an array but not a copy
		//int [] origArr=arr; 
		
		//creates another copy . New operator is not needed
		int [] origArr=Arrays.copyOf(arr, 8);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(origArr));
	
		arr[2]=5;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(origArr));
		

}
}
