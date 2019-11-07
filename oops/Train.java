package com.lti.oops;

public class Train implements IVehicle,IPublicTransport{

	@Override
	public void getNumberOfPeople() {
		// TODO Auto-generated method stub
		System.out.println("There are 50 people in the train");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("The train is moving");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("The train turned left");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("The train has stopped");
	}

}
