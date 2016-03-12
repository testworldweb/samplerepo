package com.testworldweb.objectoriented.rental;

public class Car implements Drive {

   int doors;
  ModelType modelType;
 
  int currentSpeed;
 
 public Car(ModelType  mt)
 {
	 modelType=mt;
	 currentSpeed=0;
 }
 public Car(int doors,ModelType  mt)
 {
	 this.doors=doors;
	 modelType=mt;
	 currentSpeed=0;
 }

public int getDoors() {
	return doors;
}
public void setDoors(int doors) {
	this.doors = doors;
}
public ModelType getModelType() {
	return modelType;
}
public void setModelType(ModelType modelType) {
	this.modelType = modelType;
}
public int getCurrentSpeed() {
	return currentSpeed;
}
public void setCurrentSpeed(int currentSpeed) {
	this.currentSpeed = currentSpeed;
}
public void start() {
	System.out.println("Generic Drive");
	
}
public void acellerate() {

	System.out.println("Generic Accellerate");
	
}
}
