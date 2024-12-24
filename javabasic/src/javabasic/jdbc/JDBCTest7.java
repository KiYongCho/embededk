package javabasic.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

// DatabaseMetaData, ResultSetMetaData
public class JDBCTest7 {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = ConnectionUtil.getConnection();
		
		// DatabaseMetaData 객체 생성
		DatabaseMetaData dmd = conn.getMetaData();
		System.out.println(dmd.getDatabaseMajorVersion());
		System.out.println(dmd.getDatabaseMinorVersion());
		System.out.println(dmd.getDatabaseProductName());
		System.out.println(dmd.getDatabaseProductVersion());
		System.out.println(dmd.getDriverName());
		System.out.println(dmd.getDriverVersion());
		System.out.println(dmd.getMaxConnections());
		System.out.println(dmd.getURL());
		System.out.println(dmd.getUserName());
		System.out.println(dmd.getClass());
		System.out.println(dmd.getConnection());
		System.out.println();
		
		String selectSQL = " select pid, pname, page from person ";
		PreparedStatement pstmt = conn.prepareStatement(selectSQL);
		ResultSet rs = pstmt.executeQuery();
		if (rs != null) {
			while (rs.next()) {
				System.out.println(rs.getInt("pid") + " " 
						+ rs.getString("pname") + " " + rs.getInt("page"));
			}
		}
		System.out.println();

		// ResultSetMetaData 객체 생성		
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnLabel(1));
		System.out.println(rsmd.getColumnName(1));
		System.out.println(rsmd.getColumnType(1));
		System.out.println(rsmd.getColumnTypeName(1));
		System.out.println(rsmd.getTableName(1));
		System.out.println(rsmd.isAutoIncrement(1));
		System.out.println(rsmd.isNullable(1));
		System.out.println(rsmd.isReadOnly(1));
		System.out.println(rsmd.isWritable(1));
				
		ConnectionUtil.closeConnection(conn);
		
	} // main

} // class




















































