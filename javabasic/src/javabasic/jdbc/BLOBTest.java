package javabasic.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// BLOB 컬럼 사용
public class BLOBTest {
	
	public static void main(String[] args) throws Exception {
		
		Connection conn = ConnectionUtil.getConnection();
		
		// BLOB 데이터 입력
//		String insertSQL = " insert into file_storage(id, file_name, file_data) "
//				+ " values(?, ?, ?) ";
//		
//		PreparedStatement pstmt = conn.prepareStatement(insertSQL);
//		pstmt.setInt(1, 1);
//		pstmt.setString(2, "blob.jpg");
//		
//		File file = new File("D:/embededk/files/blob.jpg");
//		FileInputStream fis = new FileInputStream(file);
//		
//		// 컬럼인덱스, 파일입력바이트스트림, 파일길이
//		pstmt.setBinaryStream(3, fis, (int)file.length());
//		
//		int result = pstmt.executeUpdate();
//		if (result > 0) {
//			System.out.println("BLOB 데이터 입력 완료!");
//		}
		
		// BLOB 데이터 조회
		String selectSQL = " select file_data from file_storage where id=? ";
		PreparedStatement pstmt = conn.prepareStatement(selectSQL);
		pstmt.setInt(1, 1);
		
		ResultSet rs = pstmt.executeQuery();
		if (rs!=null && rs.next()) {
			InputStream is = rs.getBinaryStream("file_data");
			FileOutputStream fos 
				= new FileOutputStream("D:/embededk/files/blob_copy.jpg");
			byte[] buffer = new byte[1024];
			int bytesRead = 0;
			while ((bytesRead=is.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}
			System.out.println("BLOB 컬럼의 값을 blob_copy.jpg 파일로 저장 완료!");
		}
		
		ConnectionUtil.closeConnection(conn);
		
	} // main

} // class



































