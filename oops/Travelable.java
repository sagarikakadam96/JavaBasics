package com.lti.oops;

public interface Travelable {
	final static double pi = 3.14;

	public void move();
}

interface Travelable2{ //two interfaces act like two superclass
	public void move1();
}
interface Travelable3 extends Travelable,Travelable2{ 
	public void move2();
}