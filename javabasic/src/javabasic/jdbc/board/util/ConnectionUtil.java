package javabasic.jdbc.board.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {
	
	private static ConnectionUtil connectionUtil
		= new ConnectionUtil();
	
	private Connection conn;
	
	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "BOARD";
	private static final String PASSWORD = "BOARD";
	
	private ConnectionUtil() {
	}
	
	public static ConnectionUtil getConnectionUtil() {
		return connectionUtil;
	}
	
	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return conn;
	}
	
	public void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
	public void closeAll(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs!=null) rs.close();
			if (stmt!=null) stmt.close();
			if (conn!=null) conn.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

} // class




















