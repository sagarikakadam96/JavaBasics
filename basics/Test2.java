package com.lti.basics;

public class Test2 {

	int x, y, z; // global variable

	public Test2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void display() {
		System.out.println(""+this.x+","+this.y);
	}

	public static void main(String[] args) {

		Test2 t2 = new Test2(10, 20);
		Test2 t3 = new Test2(40, 50);
		t2.display();
		t3.display();
	}
}
