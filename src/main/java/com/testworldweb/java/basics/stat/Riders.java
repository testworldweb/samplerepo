package com.testworldweb.java.basics.stat;

public class Riders {
	
	int ridersV1=11;
	static int ridersV2=21;
	
public static void main(String[] args){
		
	System.out.println("Lakers.lakersV2-- >"+Lakers.lakersV2);
	
	Lakers l1=new Lakers();
	l1.lakersV1=100;

	System.out.println("Lakers.lakersV1 (through object l1)-- >"+l1.lakersV1);
	  ridersTwo(l1);
	}
  
	public void ridersOne(String name){
		
		
	}
	
public static void ridersTwo(Lakers l1){
		
	Lakers l2=l1;
	System.out.println("Lakers.lakersV1 (through object l1)-- >"+l2.lakersV1);		
	}

}
