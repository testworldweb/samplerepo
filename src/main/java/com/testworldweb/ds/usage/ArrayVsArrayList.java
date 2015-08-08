package com.testworldweb.ds.usage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * ArrayList Usage
 * 1. add/ iterate until size
 * 2. Arrays.asList is used to initialize arraylist inline 
 */
public class ArrayVsArrayList {
	public static void main(String[] args) {

		//unsafe type casting
		//no type variable specified.You can add any object
		//compile time advantage of ensuring that  similar things added is lost
		/*
		List aList=new ArrayList();
		aList.add("my");
		aList.add("name");
		aList.add("is");
		*/

		//Arraylist 1
		List<String> aList=new ArrayList<String>();
		aList.add("my");
		aList.add("name");
		aList.add("is");
		for(int i=0;i<aList.size();i++)
		{
			System.out.println(aList.get(i));
		}
		System.out.println(aList.toString());
		
		//Arraylist 2
		ArrayList<String> bList = new ArrayList<String>(Arrays.asList("hello", "there", "world"));
		System.out.println(bList.toString());
		
		//Array
	}
}
