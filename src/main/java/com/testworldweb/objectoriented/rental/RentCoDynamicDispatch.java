package com.testworldweb.objectoriented.rental;

import java.util.ArrayList;

public class RentCoDynamicDispatch {

	ArrayList<Car> cars=new ArrayList<Car>();
	public void initialise()
	{
		cars.add(new Camry());
		cars.add(new Corvette());
		cars.add(new Camry());
		
	}
	public Car dispatchCar()
	{
		Car carTodispatch=cars.get(0);
		cars.remove(carTodispatch);
		return carTodispatch;
	}
	public void receive(Car received)
	{
		cars.add(received);
	}
	public Drive dispatchForCall()
	{
		Drive vehicleForDispatch;
		//System.out.println("-----dispatchForCall-----");
		if(cars.size()>0)
		{
			vehicleForDispatch= this.dispatchCar();
		}
		else
		{
			Rv rv=new Rv();
			vehicleForDispatch=rv;	
		}
		if(vehicleForDispatch instanceof Car)
		{
		System.out.println("Dispathching Car");	
		}
		else if(vehicleForDispatch instanceof Rv)
		{
			System.out.println("Dispathching Rv");	
		}
		//System.out.println("****End of dispatchForCall*****");
		System.out.println();
		return vehicleForDispatch;
		
		
		
	}
	public static void main(String args[])
	{
		//The advantage of interfaces . You can call the interface functions
		//of the object without knowing what the object really is. 
		RentCoDynamicDispatch rc=new RentCoDynamicDispatch();
		rc.initialise();
		rc.dispatchCar().start();;
		
		System.out.println();
		Car second=rc.dispatchCar();
		second.start();
		second.acellerate();
		
		System.out.println();
		Car third=rc.dispatchCar();
		third.start();
		third.acellerate();
		System.out.println();
		
		System.out.println("cars.length is "+rc.cars.size());

		Drive dr=rc.dispatchForCall();
		dr.start();
		dr.acellerate();
		
		System.out.println("Returning corvette to rental co");
		rc.receive(second);
		
		dr=rc.dispatchForCall();
		dr.start();
		dr.acellerate();
		
	}
}
