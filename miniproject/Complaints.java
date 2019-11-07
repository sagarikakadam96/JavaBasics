package com.lti.miniproject;
import java.sql.*;


public class Complaints {
	// jdbc driver name and db url
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	// db credentials
	static final String USER = "sava2";
	static final String PASS = "sava";

	public static Connection conn;
	public static java.sql.PreparedStatement pstmt;

	
	public static void main(String[] args) throws Exception {
		conn = null;
		pstmt = null;
		
		try {
			//register jdbc driver
			Class.forName(JDBC_DRIVER);

			//open a connection
			System.out.println("connecting to a selected db");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("connected db successfully");

			
			
			//Display all the complaints closed/closed with explanation 
			String query="select * from complaints WHERE COMPLAINT_RESPONSE IN ('Closed','Closed with explanation')";
			pstmt=conn.prepareStatement(query);
			
			ResultSet rs=pstmt.executeQuery(query);
			
			while (rs.next()){
				System.out.println(rs.getDate(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)
				+" | "+rs.getString(5)+" | "+rs.getString(6)+" | "+rs.getString(7)+" | "+rs.getInt(8)
				+" | "+rs.getString(9)+" | "+rs.getDate(10)+" | "+rs.getString(11)+" | "+rs.getString(12)
				+" | "+rs.getString(13)+" | "+rs.getInt(14));
				System.out.println();
			}
			

			
		} catch (Exception e) {
			// handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (pstmt != null)
					conn.close();
			} catch (SQLException se) {
				// do nothing
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

	}

}
