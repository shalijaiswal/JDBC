package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","shalini");
			Statement stmt=con.createStatement ();
			stmt.executeUpdate("insert into javastud values(4,'sonal'),(5,'meenal')");
					//String insert1="insert into jdbctable values(11, 'vyshnavi')";
					//String insert2="insert into jdbctable values (13, 'revanth')";
					//String insert3 ="insert into jdbctable values (14, 'akhil')";
					//stmt.addBatch (insert1);
					//stmt.addBatch (insert2);
					//stmt.addBatch (insert3);
					//stmt.executeBatch();
					System.out.println ("Records inserted successfully");
			//System.out.println("data inserted Successfully");
		}
			catch( Exception e)
			{
			System.err.println(e);
			}
	
	}

}

