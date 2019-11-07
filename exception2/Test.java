package com.lti.exception2;

public class Test {
 public static void proc() {
	 int x = 100, y;
		y = x / 0; 
		System.out.println(y);
		throw new ArithmeticException(); //used for custom exception(create our own logic)
 }
	public static void main(String[] args) {
		try {
			proc();
			} 
		catch (ArithmeticException e) {
			System.out.println("divided by zero");
		}
		finally {
			System.out.println("copyright by lti");
		}
		System.out.println("rest of the code");

	}

}
