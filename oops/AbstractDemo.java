package com.lti.oops;

public class AbstractDemo {

	public static void main(String[] args) {
		
		double area;
//		Shape s = new Shape();  //This gives error because we can create object of abstract class
		Shape s;				//We can create object of concrete sub class,i.e square or circle
		Circle c = new Circle();
		s=c;
		s.setColour("Green");
		String col=s.getColour();
		System.out.println(col);
		area=s.calculateArea();
		System.out.println(area);
		Square sq= new Square();
		s=sq;
		s.setColour("Red");
		String colr=s.getColour();
		System.out.println(colr);
		area=s.calculateArea();
		System.out.println(area);
		
		
	}

}
