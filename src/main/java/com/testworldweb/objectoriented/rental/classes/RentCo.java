package com.testworldweb.objectoriented.rental.classes;

import java.util.ArrayList;

public class RentCo {

	ArrayList<Car> cars=new ArrayList<Car>();

	
	public void initialise()
	{
		cars.add(new Camry());
		cars.add(new Corvette());
		cars.add(new Camry());
		
	}
	public Car dispatch()
	{
		Car carTodispatch=cars.get(0);
		cars.remove(carTodispatch);
		return carTodispatch;
	}
	public void receive(Car received)
	{
		cars.add(received);
	}
	public static void main(String args[])
	{
		//The advantage of interfaces . You can call the interface functions
		//of the object without knowing what the object really is. 
		//Same advantage in classes too
		RentCo rc=new RentCo();
		rc.initialise();
		Car first=rc.dispatch();
		first.start();
		first.acellerate();
		
		rc.dispatch().start();
		Car third=rc.dispatch();
		third.start();
		third.acellerate();
	}
}
