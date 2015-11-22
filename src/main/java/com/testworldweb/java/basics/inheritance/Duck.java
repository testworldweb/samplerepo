package com.testworldweb.java.basics.inheritance;

public class Duck extends Bird {

	int paddleSpeed;
	public void paddle()
	{
		System.out.println("Paddling at "+ paddleSpeed );
	}
	
	
	
	public static void main(String[] args){
		
		Bird b=new Bird();
		b.fly();
		
		Duck d=new Duck();
		d.fly();
		d.paddle();
		
		Bird b2=(Bird)new Duck();
		b2.fly();
	

		
	}
}
