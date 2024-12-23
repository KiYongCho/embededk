package javabasic.exjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

//실습 2. 이니셜 계정의 STUDENT 테이블
//          1) 한 행의 데이터를 입력하는 프로시져 PROC_INSERT_STUDENT 생성
//          2) STNO를 입력하면 이름을 반환하는 함수 FUNC_GET_STNAME 생성
//          3) 프로시져와 함수 호출하여 결과 출력

/*
CREATE OR REPLACE PROCEDURE PROC_INSERT_STUDENT
	(
		P_STNAME STUDENT.STNAME%TYPE,
		P_STEMAIL STUDENT.STEMAIL%TYPE,
		P_STPHONE STUDENT.STPHONE%TYPE
	)
IS 
BEGIN
	INSERT INTO STUDENT
	VALUES (SEQ_STUDENT.NEXTVAL, P_STNAME, P_STEMAIL, P_STPHONE);
END;

CREATE OR REPLACE FUNCTION FUNC_GET_STNAME
(P_STNO STUDENT.STNO%TYPE)
RETURN STUDENT.STNAME%TYPE 
IS 
	V_STNAME STUDENT.STNAME%TYPE;
BEGIN 
	SELECT STNAME INTO V_STNAME
	FROM STUDENT
	WHERE STNO = P_STNO;
	RETURN V_STNAME;
END;
 */
public class ExJDBC2 {
	
	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "cky";
	private static final String PASSWORD = "cky";
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn
			= DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
		
		//procedure
//		CallableStatement cstmt1 = conn.prepareCall(" {call PROC_INSERT_STUDENT(?, ?, ?)} ");
//		cstmt1.setString(1, "장보고");
//		cstmt1.setString(2, "JANG@JANG.COM");
//		cstmt1.setString(3, "010-3333-3333");
//		cstmt1.execute();
		
		// function
		CallableStatement cstmt2 = conn.prepareCall(" {? = call FUNC_GET_STNAME(?)} ");
		cstmt2.registerOutParameter(1, Types.VARCHAR);
		cstmt2.setInt(2, 1);
		cstmt2.execute();
		System.out.println(cstmt2.getString(1));		
		
	} // main

} // class











