package comm.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertValuesIntoDB {

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
		    ps.setString(1, "Rahul");
		    //ps.setString(2, "Ram");
		    int rows = ps.executeUpdate();
		    System.out.println(rows + " record inserted!");
		            
		    } catch (Exception e) {
		            e.printStackTrace();
		    }
		}

}
