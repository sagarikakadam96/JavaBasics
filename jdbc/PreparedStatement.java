package com.lti.jdbc;
import java.sql.*;
import java.util.*;

public class PreparedStatement {
	// jdbc driver name and db url

		static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
		static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
		public static Connection conn;
		public static java.sql.PreparedStatement pstmt;

		// db credentials
		static final String USER = "sava2";
		static final String PASS = "sava";

		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student id:");
			int stuid=sc.nextInt();
			System.out.println("Enter student name:");
			String stuname=sc.next();
		conn=null;
		pstmt=null;
		try{
			//step 2 register jdbc driver
			Class.forName(JDBC_DRIVER);
			
			//step 3 open a connection
			System.out.println("connecting to a selected db");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("connected db successfully");
			
			String query ="insert into student values(?,?)";
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1,stuid);
			pstmt.setString(2,stuname);
			int stucount=pstmt.executeUpdate();
			if (stucount>0){
				System.out.println("Data entered successfully");
			}
			
		}catch(Exception e){
			//handle errors for Class.forName
			e.printStackTrace();
		}
		finally{
			try{
				pstmt.close();
				conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
			
			

}
