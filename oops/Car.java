package com.lti.oops;



public abstract class Car {
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void price();
	
}
