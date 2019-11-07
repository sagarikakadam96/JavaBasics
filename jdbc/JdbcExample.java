package com.lti.jdbc;

//import required packages
import java.sql.*;


public class JdbcExample {
	// jdbc driver name and db url
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	// db credentials
	static final String USER = "sava2";
	static final String PASS = "sava";

	public static void main(String[] args) {
	Connection conn=null;
	Statement stmt=null;
	try{
		//step 2 register jdbc driver
		Class.forName(JDBC_DRIVER);
		
		//step 3 open a connection
		System.out.println("connecting to a selected db");
		conn=DriverManager.getConnection(DB_URL,USER,PASS);
		System.out.println("connected db successfully");
		
		//step 4 execute a query
		//System.out.println("inserting records into the table");
		stmt=conn.createStatement();
		String sql="delete from emp where name='Katrina'";
		//String sql="alter table emp add desig varchar(10)";
		//String sql="update emp set desig='janitor' where name='Katrina'";
		//String sql="update emp set id='4' where name='Vicky'";
		
		//count will give you how many records got updated
		
		//stmt.executeUpdate(sql);
		/*String sql="insert into emp values(8,'Katrina','janitor')";
		stmt.executeUpdate(sql);
		 sql="insert into emp values(8,'Katrina','janitor')";
		stmt.executeUpdate(sql);

		 sql="insert into emp values(8,'Katrina','janitor')";
		stmt.executeUpdate(sql);*/

		int count=stmt.executeUpdate(sql);
		System.out.println(count);
		
/*
		sql="insert into emp values(8,'Anushka')";
		stmt.executeUpdate(sql);
		sql="insert into emp values(8,'Vicky')";
		stmt.executeUpdate(sql);
		sql="insert into emp values(8,'Shah Rukh Khan')";
		stmt.executeUpdate(sql);
		sql="insert into emp values(8,'Akshay')";
		stmt.executeUpdate(sql);*/
	}catch(Exception e){
		//handle errors for Class.forName
		e.printStackTrace();
	}
		finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					conn.close();	
			}catch(SQLException se){
				//do nothing
			}
			try{
				if(conn!=null)
					conn.close();	
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
	System.out.println("goodbye");
	}

}

