package com.lti.oops;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		System.out.println("user is a minor");
	}
}