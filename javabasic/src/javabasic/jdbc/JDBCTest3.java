package javabasic.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// PreparedStatement를 이용한 CRUD (Create, Retreive, Update, Delete)
public class JDBCTest3 {
	
	public static void main(String[] args) {

		Connection conn = ConnectionUtil.getConnection();
		
		// insert
		// ? : placeholder (위치지정자)
//		String insertSQL = " insert into person values(seq_person.nextval, ?, ?) ";
//		try {
//			
//			PreparedStatement pstmt = conn.prepareStatement(insertSQL);
//			// 1번 위치지정자 설정
//			pstmt.setString(1, "장보고");
//			// 2번 위치지정자 설정
//			pstmt.setInt(2, 40);
//			
//			// 입력된 행의 수를 반환
//			int result = pstmt.executeUpdate();
//			if (result > 0) {
//				System.out.println("한 행의 데이터가 입력됨!");
//			}
//			
//		} catch (SQLException sqle) {
//			sqle.printStackTrace();
//		}
		
		// update
//		String updateSQL = " update person set pname='홍길순' where pid=? ";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(updateSQL);
//			pstmt.setInt(1, 1);
//			// 수정된 행의 수를 int로 리턴
//			int result = pstmt.executeUpdate();
//			if (result > 0) {
//				System.out.println("한 행의 데이터가 수정됨!");
//			}
//		} catch (SQLException sqle) {
//			sqle.printStackTrace();
//		}
		
		// delete : 실습 pid가 1인 행을 삭제
//		String deleteSQL = " delete person where pid=? ";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
//			pstmt.setInt(1, 1);
//			// 수정된 행의 수를 int로 리턴
//			int result = pstmt.executeUpdate();
//			if (result > 0) {
//				System.out.println("한 행의 데이터가 삭제됨!");
//			}
//		} catch (SQLException sqle) {
//			sqle.printStackTrace();
//		}
		
		// select
		String selectSQL = " select pid,pname,page from person ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(selectSQL);
			rs = pstmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					System.out.println(
							rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) 
					);
				}
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				// Connection, Statement, PreparedStatement, CallableStatement
				// ResultSet은 객체 사용 후 반드시 close 해줘야 함!
				// close하는 순서는 사용한 반대 순서를 따르면 됨
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		
		ConnectionUtil.closeConnection(conn);
		
	} // main

} // class





























