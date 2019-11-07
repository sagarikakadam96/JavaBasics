package com.lti.oops;


class Student{
	int a; //instance member
	static int b; //static member
	
	Student(){
		++a; //re initializes when a new object is created
		++b; 
	}
	public void showData(){
		System.out.println(a);
		System.out.println(b);
	}
}
public class StaticInstanceDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.showData();
		Student s2=new Student();
		s2.showData();
	}

}
