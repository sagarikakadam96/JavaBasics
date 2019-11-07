package com.lti.oops;

public class StaticExample {
	transient static int a=10;
	int b =30;
	

	static void showdata(){
		System.out.println(a); //to access a static variable in a static method, an object doesn't need to be created of that class, it can be directly accessed
		StaticExample s1= new StaticExample();
		System.out.println(s1.b); //to access a non static variable in a static method, an object needs to be created of that class 
		hi(); //one static method can call another static method directly without creating object
	}
	
	static void hi(){
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		hi();
		StaticExample s1= new StaticExample();
		showdata(); //one static method can call another static method directly without creating object
		System.out.println(s1.b);
	}
}
