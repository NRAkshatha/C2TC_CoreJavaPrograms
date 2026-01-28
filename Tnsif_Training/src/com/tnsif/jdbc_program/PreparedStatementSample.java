package com.tnsif.jdbc_program;

 

import java.sql.*;

public class PreparedStatementSample {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/B_02";
		String username = "postgres";
		String password = "ammu1234";
		
		String studentName = "Kholi";
		String studentDept = "AI & DS";
		int yearOfPassing = 2026;
		
		
		String query = "INSERT INTO student(student_name, student_dept, year_of_passing) VALUES(?, ?, ?) ";
		
		
		try {
			
			//Load the driver - 2nd step
			Class.forName("org.postgresql.Driver");
			
			
			//Establishing the connection - 3rd step
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			//Define SQL Query - 4th step
			
			PreparedStatement st = con.prepareStatement(query);
			
			//Execting the query - 5th step
			
			st.setString(1, studentName);
			st.setString(2, studentDept);
			st.setInt(3, yearOfPassing);
			
			
			//Process the Result - 6th Step
			
			int rs = st.executeUpdate();
			System.out.println(rs +" row/s affected");
			
			
			
			//close the resources - 7th
			
			st.close();
			con.close();
			
			
		}
		

		catch(Exception e)
		{
			e.printStackTrace();
		}
		


	}

}

