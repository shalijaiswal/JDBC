package databaseconnection;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.DriverManager;

public class jdbcdemo {
public static void main(String args[]) throws ClassNotFoundException ,SQLException {
		//step 1 register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2 establish a connection
		
Connection  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","shalini");
		System.out.println("connection created");
		
		
		
	}

}
