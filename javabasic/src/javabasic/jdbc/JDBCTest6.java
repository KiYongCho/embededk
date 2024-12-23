package javabasic.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// JDBC에서의 Transaction 처리
public class JDBCTest6 {
	
	public static void main(String[] args) {
		
		Connection conn = ConnectionUtil.getConnection();
		
		try {
			
			// 1. autocommit 방지
			conn.setAutoCommit(false);
			
			// 2. SQL 작업 수행
			
			// 2-1. insert
			String insertSQL = " insert into person values(seq_person.nextval, ?, ?) ";
			PreparedStatement pstmt1 = conn.prepareStatement(insertSQL);
			pstmt1.setString(1, "장군");
			pstmt1.setInt(2, 100);
			int result1 = pstmt1.executeUpdate();
			if (result1>0) System.out.println("입력 완료!");
			
			// 강제 예외 발생시킴
			int i = 100 / 0;
			
			// 2-2. delete
			String deleteSQL = " delete person where pname=? ";
			PreparedStatement pstmt2 = conn.prepareStatement(deleteSQL);
			pstmt2.setString(1, "장군");
			int result2 = pstmt2.executeUpdate();
			if (result2>0) System.out.println("삭제 완료!");	
			
			// 3. commit
			conn.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				// 트랜잭션 중에 예외가 발생하면 롤백 수행
				conn.rollback();
				conn.setAutoCommit(true); // 필요하다면 자동커밋 설정
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
				
	} // main

} // class

































