package com.testworldweb.java.basics.inheritance.constructors;

public class Duck extends Bird {

	


	int paddleSpeed;
	
	//atleast all properties in the Base class constructor must be specified here 
	
	Duck(int noOfWings, String featherColor, int flyspeed) {
		super(noOfWings, featherColor, flyspeed);
	}
	
	Duck(int noOfWings, String featherColor, int flyspeed,int paddleSpeed) {
		super(noOfWings, featherColor, flyspeed);
		this.paddleSpeed=paddleSpeed;
	}

	public void paddle()
	{
		System.out.println("Paddling at "+ paddleSpeed );
	}
	
	
	
	public static void main(String[] args){
		
		Bird crow=new Bird(2,"black",2);
		crow.fly();
		
		Duck d=new Duck(2,"black",10);
		d.fly();
		d.paddle();
		
		Bird b2=new Duck(2,"grey",10);
		b2.fly();
		
	
		//Duck d2 =new Bird(); // compile error
		
	}
}
