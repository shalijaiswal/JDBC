package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
	public static void main(String args[]) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","shalini");
		Statement stmt=con.createStatement ();
	stmt.executeUpdate("update emp set name='kajal' where rno=10 ");
	System.out.println ("Records updated successfully");
	//stmt.execute("select * from emp");
	//System.out.println("data inserted Successfully");
}
	catch( Exception e)
	{
	System.err.println(e);
	}
}
}

