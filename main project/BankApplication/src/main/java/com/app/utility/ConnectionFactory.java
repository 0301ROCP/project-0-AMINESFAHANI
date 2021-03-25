package com.app.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	
		
		private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
		private static final String USERNAME = "administrator";
		private static final String PASSWORD = "mame6536";
		
		private static  Connection conn;
		
		public static Connection getConnection() {
		try {conn =  DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return conn;

	}

}
