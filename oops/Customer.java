package com.lti.oops;

class Maruti extends Car{
	public void price(){
		System.out.println("5L");
	}
}

class Toyota extends Car{
	@Override
	public void price(){
		System.out.println("25L");
	}
}

public class Customer {

	public static void main(String[] args) {
		Car c1 = new Maruti();
		c1.price();
		
		//Car c = new Car();
		
		Car c2 = new Toyota();
		c2.price();

	}

}
