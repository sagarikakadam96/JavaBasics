package com.lti.oops;

public class InterfaceDemo {

	public static void main(String[] args) {
		
	//	Travelable t=new Travelable(); --> not allowed because it is an interface. Object cannot be created fro an interface.
		Travelable t1=new Bus();
		t1.move();
		Travelable t2=new Cars();
		t2.move();

	}

}
