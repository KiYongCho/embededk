package javabasic.jdbc.board.main;

import javabasic.jdbc.board.model.Board;
import javabasic.jdbc.board.service.BoardService;
import javabasic.jdbc.board.service.impl.BoardServiceImpl;

public class BoardMain {
	
	public static void main(String[] args) {
		
		BoardService boardService = new BoardServiceImpl();
		
		// System.out.println(boardService.listBoard());
		
		// System.out.println(boardService.getBoard(3));
		
		// boardService.registBoard(new Board(0, "만화게시판", null, null));
		
		// boardService.modifyBoard(new Board(21, "뉴만화게시판", null, "Y"));
		
		// boardService.removeBoard(21);
		
	}

}










