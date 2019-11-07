package com.lti.oops;

class TestCustomException {
	static void validate(int age) throws InvalidAgeException{
		if (age < 18)
			throw new InvalidAgeException();
		else
			System.out.println("welcome to vote");
	}
	public static void main(String args[]){
		try {
			validate(13);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}
