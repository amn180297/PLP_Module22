package com.cg.spring.plpmod20.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseUtil {
	public static Connection getConnection() throws ClassNotFoundException, IOException {
		Properties props = new Properties();
		FileInputStream in = new FileInputStream("db.properties");
		props.load(in);
		in.close();
		String driver = props.getProperty("driver");
		if (driver != null) {
			Class.forName(driver);
		}
		String url = props.getProperty("url");
		String username = props.getProperty("username");
		String password = props.getProperty("password");
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
}
