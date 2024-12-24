package javabasic.jdbc;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CLOBTest {
	
	public static void main(String[] args) throws Exception {
		
		Connection conn = ConnectionUtil.getConnection();
		
		// CLOB 데이터 삽입
//		String insertSQL = " insert into file_storage(id, file_name, text_data) "
//				+ " values(?, ?, ?) ";
//		PreparedStatement pstmt = conn.prepareStatement(insertSQL);
//		pstmt.setInt(1, 2);
//		pstmt.setString(2, "clob.txt");
//		
//		String longText = "";
//		for (int i=0; i<100000; i++) {
//			longText += "Goodbye Java!";
//		}
//		Reader reader = new StringReader(longText);
//		pstmt.setCharacterStream(3, reader, longText.length());
//		int result = pstmt.executeUpdate();
//		if (result > 0) {
//			System.out.println("CLOB 데이터 입력 완료!");
//		}
		
		// CLOB 데이터 조회
		String selectSQL = " select text_data from file_storage where id=? ";
		PreparedStatement pstmt = conn.prepareStatement(selectSQL);
		pstmt.setInt(1,  2);
		
		ResultSet rs = pstmt.executeQuery();
		if (rs!=null && rs.next()) {
			Reader reader = rs.getCharacterStream("text_data");
			BufferedReader br = new BufferedReader(reader);
			String line = null;
			int charCount = 0;
			while ((line=br.readLine()) != null) {
				System.out.println(line);
				charCount += line.length();
			}
			System.out.println("CLOB 데이터 " + charCount +"개 문자 출력 완료!");
		}
		
		ConnectionUtil.closeConnection(conn);
		
	} // main

} // class






























