package com.lti.oops;

abstract public class Shape {
	String colour;
	abstract double calculateArea();
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
}
class Circle extends Shape{
	double area,r=5;
	double calculateArea(){
		area=3.14*r*r;
		return area;
	}
}

class Square extends Shape{
	double area,r=4;
	double calculateArea(){
		area=r*r;
		return area;
	}
}