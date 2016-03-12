package com.testworldweb.objectoriented.rental.classes;

public abstract class Car {

 private  int doors;
 private ModelType modelType;
 private int currentSpeed;
 
 public Car(ModelType  mt)
 {
	 doors=4;
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
	System.out.println("Generic Drive start");
	
}
public abstract void acellerate();
}
