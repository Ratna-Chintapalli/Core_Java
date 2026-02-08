package comm.exceptionhandling;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class DBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1) loading driver class
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
			String query = "select * from employee";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
				System.out.println();
			}

		} finally {
			rs.close();
			stmt.close();
			con.close();
		}

	}

}
