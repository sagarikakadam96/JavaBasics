package com.lti.oops;

public class B {

	public static void main(String[] args){
		int x=10;
		int y=20;
		Integer z = 10;
		
		System.out.println(x==y);
		A a1=new A();
		A a2=new A();
		
		a1.setName("Ravi");
		a1.setAge(21);
		System.out.println("age:"+a1.getAge()+"name:"+a1.getName());
		
		a2.setAge(22);
		a2.setName("Rajesh");
		System.out.println("age:"+a2.getAge()+"name:"+a2.getName());
	}
}
