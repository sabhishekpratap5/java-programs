package com.bridgelabz.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class JdbcTest {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student");
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
				con.close();  
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
