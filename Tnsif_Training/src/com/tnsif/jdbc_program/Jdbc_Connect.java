package com.tnsif.jdbc_program;



import java.sql.*; 

public class Jdbc_Connect {

	public static void main(String[] args) {
		
		
		String url = "jdbc:postgresql://localhost:5432/B_02";
		String username = "postgres";
		String password = "ammu1234";
		
		
		try {
			
			
			Class.forName("org.postgresql.Driver");
			
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			Statement st = con.createStatement();
			
			String query = "SELECT * FROM student";
			
			ResultSet rs = st.executeQuery(query);
			
			
			while(rs.next())
				
			{
				String table = rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getInt(3);
				System.out.println(table);
			}

			
			rs.close();
			st.close();
			con.close();
			
			
		}
		

		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}


