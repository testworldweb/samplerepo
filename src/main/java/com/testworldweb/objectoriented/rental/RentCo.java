package com.testworldweb.objectoriented.rental;

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
	public void driveOnCall()
	{
		System.out.println("Drive on call");
		if(cars.size()>0)
		{
		Car temp= this.dispatch();
		temp.start();
		temp.acellerate();
		}
		else
		{
			Rv rv=new Rv();
			rv.start();
			rv.acellerate();	
		}
		

		System.out.println("****End Drive on call*****");
		System.out.println();
		
	}
	public static void main(String args[])
	{
		//The advantage of interfaces . You can call the interface functions
		//of the object without knowing what the object really is. 
		RentCo rc=new RentCo();
		rc.initialise();
		rc.dispatch().start();;
		
		System.out.println();
		Car second=rc.dispatch();
		second.start();
		second.acellerate();
		
		System.out.println();
		Car third=rc.dispatch();
		third.start();
		third.acellerate();
		System.out.println();
		
		System.out.println("cars.length is "+rc.cars.size());

		rc.driveOnCall();
		
		rc.receive(second);
		
		rc.driveOnCall();
		/*System.out.println();
		Rv rv=new Rv();
		rv.start();
		rv.acellerate();
		*/
	}
}
