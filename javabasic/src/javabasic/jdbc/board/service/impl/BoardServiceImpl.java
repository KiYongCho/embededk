package javabasic.jdbc.board.service.impl;

import java.util.List;

import javabasic.jdbc.board.dao.BoardDao;
import javabasic.jdbc.board.dao.impl.BoardDaoImpl;
import javabasic.jdbc.board.model.Board;
import javabasic.jdbc.board.service.BoardService;

public class BoardServiceImpl implements BoardService {
	
	private BoardDao boardDao;
	
	public BoardServiceImpl() {
		boardDao = new BoardDaoImpl();
	}

	@Override
	public List<Board> listBoard() {
		return boardDao.listBoard();
	}

	@Override
	public Board getBoard(int bid) {
		return boardDao.getBoard(bid);
	}

	@Override
	public int registBoard(Board board) {
		return boardDao.registBoard(board);
	}

	@Override
	public int modifyBoard(Board board) {
		return boardDao.modifyBoard(board);
	}

	@Override
	public int removeBoard(int bid) {
		return boardDao.removeBoard(bid);
	}

}
