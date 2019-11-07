package com.lti.jdbc;

import java.sql.Connection; //Interface to create connection.
import java.sql.DriverManager; 
import java.sql.ResultSet; //Interface that provides mechanism to store results acquired from db
import java.sql.Statement; 

public class OracleCon {

	public static void main(String[] args) {
		try{
			//step 1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver"); //package name oracle.jdbc.driver. OracleDriver class name. forName is a static method.
			
			//step 2 create the connection object (sql exception starts here)
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sava2","sava"); //port number 1521. in place of localhost you will write the ip address of the server to which you will actually be connecting.
			
			//step 3 create the statement object
			Statement stmt=con.createStatement(); //con is reference of connection. you dont need to know the class name.
			
			//step 4 execute query
			ResultSet rs=stmt.executeQuery("select * from emp order by id desc");
			while (rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)); //rs.getInt(1) corresponds to number in oracle, rs.getString(2) correspnds to varchar. col number in oracle starts from 1.
			
			//step 5 close the connection object
			con.close();
			
		} catch(Exception e){
			System.out.println(e);
		}

	}

}
