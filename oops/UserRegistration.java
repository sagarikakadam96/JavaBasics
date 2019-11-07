package com.lti.oops;

import java.util.*;

public class UserRegistration {

	public static void main(String[] args) {
		String userName,country;
		int age;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username:");
		userName=sc.next();
		System.out.println("Enter age:");
		age=sc.nextInt();
		System.out.println("Enter country:");
		country=sc.next();
		registerProfile(age,country);
		System.out.println("Username:"+userName);
	}

	static void registerProfile(int age,String country){
	
		try{
			if(age<18)
				throw new InvalidAgeException();
		}
		catch(InvalidAgeException e){
		}
		try{
			if(!(country.equals("India")))
				throw new InvalidCountryException();
		}
		catch(InvalidCountryException e){
		}
	}

}
