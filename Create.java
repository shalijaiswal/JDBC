package databaseconnection;
import java.sql.*;

public class Create {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","shalini");
			Statement stmt=con.createStatement ();
			stmt.execute("create table javastud(rollno int(3), name varchar(10))");
			System.out.println("Table Created Successfully");
		}
			catch( Exception e)
			{
			System.err.println(e);
			}
	
	}

}

