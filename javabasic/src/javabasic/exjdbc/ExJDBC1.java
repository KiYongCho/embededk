package javabasic.exjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 실습 1. 이니셜 계정의 STUDENT 테이블
//           PreparedStatement 사용 CRUD (INSERT > UPDATE > DELETE > SELECT 순)
//CREATE SEQUENCE SEQ_STUDENT;
//CREATE TABLE STUDENT(
//		STNO NUMBER PRIMARY KEY,
//		STNAME VARCHAR2(20) NOT NULL,
//		STEMAIL VARCHAR2(200),
//		STPHONE VARCHAR2(20)
//);
public class ExJDBC1 {

	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "cky";
	private static final String PASSWORD = "cky";
	
	public static void main(String[] args) throws SQLException {
		
		
		Connection conn
			= DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
		
		// insert
//		String insertSQL = " insert into student values(seq_student.nextval, ?, ?, ?) ";
//		PreparedStatement pstmt = conn.prepareStatement(insertSQL);
//		pstmt.setString(1, "유관순");
//		pstmt.setString(2, "YOU@YOU.COM");
//		pstmt.setString(3, "010-3333-3333");
//		int result = pstmt.executeUpdate();
//		if (result>0) System.out.println("입력 완료!");
		
		// update
//		String updateSQL = " update student set stname=?, stemail=?, stphone=? "
//				+ " where stno=? ";
//		PreparedStatement pstmt = conn.prepareStatement(updateSQL);
//		pstmt.setString(1, "UP_유관순");
//		pstmt.setString(2, "UP_YOU@YOU.COM");
//		pstmt.setString(3, "UP_010-3333-3333");
//		pstmt.setInt(4, 21);
//		int result = pstmt.executeUpdate();
//		if (result>0) System.out.println("수정 완료!");		
		
		// delete
//		String deleteSQL = " delete student where stno=? ";
//		PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
//		pstmt.setInt(1, 21);
//		int result = pstmt.executeUpdate();
//		if (result>0) System.out.println("삭제 완료!");
		
		// select
		String selectSQL = " select stno, stname, stemail, stphone from student ";
		PreparedStatement pstmt = conn.prepareStatement(selectSQL);
		ResultSet rs = pstmt.executeQuery();
		if (rs != null) {
			while (rs.next()) {
				System.out.println(
						rs.getInt("stno") + " "
						+ rs.getString("stname") + " "
						+ rs.getString("stemail") + " "
						+ rs.getString("stphone")
				);
			}
		}
		
	} // main

} // class














