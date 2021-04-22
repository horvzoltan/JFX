package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public Connection databaseLink;

	public Connection getConnection() {
		String dbPassword = "almarepa2";
		String dbUser = "root";
		String dbName = "inventory";
		String url = "jdbc:mysql://localhost/" + dbName;
		try {
			Class.forName("com.mysql.jc.jdbc.Dirver");
			databaseLink = DriverManager.getConnection(url, dbUser, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return databaseLink;
	}
}
