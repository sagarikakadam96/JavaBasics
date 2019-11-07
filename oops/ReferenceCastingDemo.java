package com.lti.oops;

class Vehicles{
	public void price(){
		System.out.println("Done");
	}
}

class Marutis extends Vehicles{
	
}

public class ReferenceCastingDemo {

	public static void main(String[] args) {
		Vehicles c1=new Marutis(); //upcasting
		c1.price(); 
		Marutis m1=(Marutis) new Vehicles(); //downcasting with type casting. No compile time error. Shows runtime error.
		m1.price(); 
		
	}

}
