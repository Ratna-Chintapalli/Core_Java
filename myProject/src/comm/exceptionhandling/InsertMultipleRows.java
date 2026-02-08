package comm.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertMultipleRows {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Loading the daatabase  ");
			// 2) Connecting to the database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b65", "root", "root");
			// 3) Statement
			stmt = con.createStatement();
			String query = "INSERT INTO student (name, city) VALUES (?, ?)";
		    PreparedStatement ps = con.prepareStatement(query);        
		    String[] names = {"Rahul", "Arjun", "Sneha"};
		    String[] cities = {"Hyd", "Delhi", "Mumbai"};
		    
		    int rows=0;
		    for (int i = 0; i < names.length; i++) {
		        ps.setString(1, names[i]);
		        ps.setString(2, cities[i]);
		        //ps.executeUpdate();  // inserts every time
		        rows += ps.executeUpdate();
		    }
		    //rows = ps.executeUpdate();
		    System.out.println(rows + " record inserted!");
		            
		    } catch (Exception e) {
		            e.printStackTrace();
		    }
		}

}
