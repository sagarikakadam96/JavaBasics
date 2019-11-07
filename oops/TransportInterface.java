package com.lti.oops;

public class TransportInterface {

	public static void main(String[] args) {
		FourWheeler f=new FourWheeler();
		Train t=new Train();
		f.brake();
		t.brake();
		f.drive();
		t.drive();
		f.turnLeft();
		t.turnLeft();
		f.checkMotor();
		t.getNumberOfPeople();
	}

}
