package javabasic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Statement 인터페이스를 사용한 쿼리 수행
public class JDBCTest2 {
	
	public static void main(String[] args) {
		
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "JDBC";
		String password = "JDBC";
		
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection(jdbcURL, username, password);
			
			// 데이터베이스에 보낼 쿼리객체 생성
			Statement stmt = conn.createStatement();
			
			// 데이터베이스에 보낼 쿼리문자열
//			String insertSQL = " INSERT INTO PERSON "
//					+ " VALUES(SEQ_PERSON.NEXTVAL, '이순신', 50) ";
//			
//			// insert, update, delete 등 select가 아닌 sql은 executeUpdate 호출
//			// 결과는 영향받은 행의 수를 int로 리턴
//			int result = stmt.executeUpdate(insertSQL);
//			if (result > 0) {
//				System.out.println("한 행의 데이터가 입력됨!");
//			} else {
//				System.out.println("데이터 입력 실패!");
//			}
			
			String selectSQL = " SELECT PID, PNAME, PAGE FROM PERSON ";
			
			// select 쿼리의 경우 executeQuery메소드를 사용
			// 결과는 select행들을 가리키는 커서인 ResultSet
			ResultSet rs = stmt.executeQuery(selectSQL);
			if (rs != null) {
				// 다음 행이 있으면 다음 행을 가리킴, 다음 행이 있는 동안 반복 
				while (rs.next()) {
					System.out.println(
							rs.getInt(1) + " "
							+ rs.getString(2) + " "
							+ rs.getInt(3)
					);
				}
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









































