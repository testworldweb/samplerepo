package com.testworldweb.objectoriented.rental.classes;

public class Camry extends Car {
//if case class gets constructor , then its mandatory for the derived class to define it as well
	public Camry() {
		super(4, ModelType.FULLSIZE);
		
	}

	public void start() {
	System.out.println("starting Camry");
		
	}

	public void acellerate() {
		System.out.println("Accellerating 30 mph");
		
	}


}
