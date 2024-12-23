package javabasic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 데이터베이스 연결
public class JDBCTest1 {
	
	public static void main(String[] args) {
		
		// JDBC URL : 연결하려는 데이터베이스 접속정보
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "JDBC"; // 계정명
		String password = "JDBC";  // 계정비밀번호
		
		// 데이터베이스 연결 객체
		Connection conn = null;
		
		try {
			
			// DriverManager의 getConnection 호출해서 Connection 획득
			conn = DriverManager.getConnection(jdbcURL, username, password);
			
			if (conn != null) {
				System.out.println("데이터베이스 연결 성공!");
			} else {
				System.out.println("데이터베이스 연결 실패!");
			}			
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
				
	} // main

} // class































