package javabasic.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// Gson을 활용한 JDBC 작업
public class JDBCTest5 {

	public static void main(String[] args) throws Exception {
		
		Connection conn = ConnectionUtil.getConnection();
		
		// Gson 객체
		Gson gson = new GsonBuilder().create();		
		
		// insert
//		String insertSQL = " insert into person values(seq_person.nextval, ?, ?) ";
//		PreparedStatement pstmt = conn.prepareStatement(insertSQL);
//		
//		// JSON 문자열
//		String jsonStr = "{\"pid\":0, \"pname\":\"권율\", \"page\":50}";
//		// JSON 문자열을 Person 객체로
//		Person person = gson.fromJson(jsonStr, Person.class);
//		
//		pstmt.setString(1, person.getPname());
//		pstmt.setInt(2, person.getPage());
//		int result = pstmt.executeUpdate();
//		if (result>0) System.out.println("입력 성공!");
		
		// update
//		String updateSQL = " update person set pname=?, "
//				+ " page=? where pid=? ";
//		PreparedStatement pstmt = conn.prepareStatement(updateSQL);
//		
//		// JSON 문자열
//		String jsonStr = "{\"pid\":4, \"pname\":\"양만춘\", \"page\":70}";
//		// JSON 문자열을 Person 객체로
//		Person person = gson.fromJson(jsonStr, Person.class);
//		
//		pstmt.setString(1, person.getPname());
//		pstmt.setInt(2, person.getPage());
//		pstmt.setInt(3, person.getPid());
//		int result = pstmt.executeUpdate();
//		if (result>0) System.out.println("수정 성공!");	
		
		// delete
//		String deleteSQL = " delete person where pid=? ";
//		PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
//		
//		// JSON 문자열
//		String jsonStr = "{\"pid\":4, \"pname\":\"\", \"page\":0}";
//		// JSON 문자열을 Person 객체로
//		Person person = gson.fromJson(jsonStr, Person.class);
//		
//		pstmt.setInt(1, person.getPid());
//		int result = pstmt.executeUpdate();
//		if (result>0) System.out.println("삭제 성공!");
		
		// select
		String selectSQL = " select pid,pname,page from person ";
		PreparedStatement pstmt = conn.prepareStatement(selectSQL);
		
		List<Person> personList = new ArrayList<Person>();
		
		ResultSet rs = pstmt.executeQuery();
		if (rs != null) {
			while (rs.next()) {
				Person person = new Person();
				person.setPid(rs.getInt("pid"));
				person.setPname(rs.getString("pname"));
				person.setPage(rs.getInt("page"));
				personList.add(person);
			}
		}
		
		// 한 행의 데이터 = Person 객체 하나
		// List는 각 행의 데이터를 Person객체에 저장
		
		// List를 JSON문자열로 변환해서 출력
		System.out.println(gson.toJson(personList));
				
		ConnectionUtil.closeConnection(conn);		
		
	} // main
	
} // class





























