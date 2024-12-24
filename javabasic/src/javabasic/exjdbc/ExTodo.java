package javabasic.exjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExTodo {
	
	private static Connection conn;
	private static List<Todo> todoList;

	public static void main(String[] args) {
		
		try { 
			conn = ConnectionUtil.getConnection();
			selectMenu();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
	} // main
	
	private static void printList() throws SQLException {
		if (todoList==null || todoList.isEmpty()) {
			System.out.println("=================================");
			System.out.println("등록된 TODO가 없습니다!");
			System.out.println("=================================");
		} else {
			System.out.println("[Todo List]");
			for (Todo todo : todoList) {
				System.out.println(todo);
			}
		}
		System.out.println();
		selectMenu();
	}
	
	private static void selectMenu() throws SQLException {
		System.out.println("#################################");
		System.out.println("메뉴(1.목록 2.등록 3.삭제 4.완료처리 5.종료)를 선택해 주세요!");
		System.out.println("#################################");
		Scanner scanner = new Scanner(System.in);
		switch (scanner.nextLine()) {
			case "1": selectTodoList(); break;
			case "2": {
				System.out.println("작성자이름과 내용을 입력해 주세요! (형식:홍길동,바벨2000회)");
				String inputStr = new Scanner(System.in).nextLine();
				Todo todo = new Todo(
					0, 
					null, 
					inputStr.substring(0, inputStr.indexOf(",")),
					inputStr.substring(inputStr.indexOf(",") + 1),
					"N"
				);
				insertTodo(todo);
				selectTodoList();
			}
			case "3": {
				System.out.println("삭제하실 TODO 번호를 입력해 주세요!");
				deleteTodo(new Scanner(System.in).nextLine());
				selectTodoList();
			}
			case "4": {
				System.out.println("완료처리하실 TODO 번호를 입력해 주세요!");
				updateTdyn(new Scanner(System.in).nextLine());
				selectTodoList();
				printList();				
			}
			case "5": exitProgram();
		}
		scanner.close();
	}
	
	private static void selectTodoList() throws SQLException {
		todoList = new ArrayList<Todo>();
		String sql = " select tdno, tddate, tdwriter, tdcontent, tdyn from todo "
				+ " order by tdno desc ";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			todoList.add(
				new Todo(
						rs.getInt("tdno"),
						rs.getTimestamp("tddate"),
						rs.getString("tdwriter"),
						rs.getString("tdcontent"),
						rs.getString("tdyn")
				)
			);
		}
		printList();
	}
	
	private static void insertTodo(Todo todo) throws SQLException {
		String sql = " insert into todo values(todo_seq.nextval, sysdate, ?, ?, ?) ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, todo.getTdwriter());
		pstmt.setString(2, todo.getTdcontent());
		pstmt.setString(3, todo.getTdyn());
		pstmt.executeUpdate();
	}
	
	private static void deleteTodo(String tdno) throws SQLException {
		String sql = " delete todo where tdno=? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, tdno);
		pstmt.executeUpdate();	
	}
	
	private static void updateTdyn(String tdno) throws SQLException {
		String sql = " update todo set tdyn='Y' where tdno=? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, tdno);
		pstmt.executeUpdate();			
	}
	
	private static void exitProgram() {
		System.out.println("프로그램을 종료합니다!");
		System.exit(0);
	}
	
} // class





























