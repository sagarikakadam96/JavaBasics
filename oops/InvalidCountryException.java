package com.lti.oops;

@SuppressWarnings("serial")
class InvalidCountryException extends Exception {
	 public InvalidCountryException() {
		System.out.println("user outside india cannot be registered");
	}
}
