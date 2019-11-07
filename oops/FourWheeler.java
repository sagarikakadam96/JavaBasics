package com.lti.oops;

public class FourWheeler extends MotorisedVehicle implements IVehicle{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("The car is moving");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("The car turned left");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("The car has stopped");
	}

}
