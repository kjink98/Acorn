package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class OracleConnectionTest {
	@Test
	public void ConnectionTest() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn =
				DriverManager.getConnection(url, "scott", "1111");
		
		System.out.println(conn);
		conn.close();
	}
}
