package com.lti.oops;

class Animal{
	int x=100;
	public void run(){
		System.out.println("Animal is running");
	}
}


public class Horse extends Animal{
	int x=200;
	public void run(){
		super.run();//output is animal is running
		System.out.println("Horse is running");
	}
	
	public static void main(String[] args) {
		
		Horse h=new Horse();
		h.run(); //output is horse is running

		Animal a=new Animal(); 
		a.run(); //output is animal is running
		
		Animal a1=new Horse();
		a1.run(); //output is horse is running(has nothing to do with constructor. Variable overriding is not possible in java.)
		
		System.out.println(a1.x); //prints 100
	}

}
