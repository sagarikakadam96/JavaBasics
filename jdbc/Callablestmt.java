package com.lti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class Callablestmt {
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static Connection conn;

	// db credentials
	static final String USER = "sava2";
	static final String PASS = "sava";

	public static void main(String[] args){

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			CallableStatement stmt = null;
			stmt = conn.prepareCall("{call mypro(?,?)}");
			stmt.setInt(1, 5);
			stmt.setString(2, "suman");
			stmt.execute();
			System.out.println("Success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
