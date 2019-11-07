package com.lti.io2;

import java.io.*;

@SuppressWarnings("serial")
class Employee implements Serializable {
	long empId;
	String empName;
	transient long empSalary;

	Employee(long empId, String empName, long empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String toString() {
		return "Employee id= " + empId + ";Employee Name is " + empName + " Employee salary is " + empSalary;
	}
}

public class SerializationDemo {

	public static void main(String[] args) {
		try{
			Employee emp=new Employee(135234,"Ramesh",125000);
			System.out.println("Employee before serialization: "+emp);
			FileOutputStream fileOut=new FileOutputStream("d:/data.txt");
			
			//serialization
			ObjectOutputStream oos=new ObjectOutputStream(fileOut);
			oos.writeObject(emp);
			oos.flush(); //frees the memory
			oos.close(); //closes the resources
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		/*try{
			Employee emp;
			FileInputStream fileIn=new FileInputStream("d:/data.txt");
			ObjectInputStream ois=new ObjectInputStream(fileIn);
			emp=(Employee)ois.readObject();
			ois.close();
			System.out.println("Employee before deserialization: "+emp);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}*/
	}
}
