package javabasic.jdbc.board.dao;

import java.util.List;

import javabasic.jdbc.board.model.Board;

public interface BoardDao {
	
	public abstract List<Board> listBoard();
	
	public abstract Board getBoard(int bid);
	
	public abstract int registBoard(Board board);
	
	public abstract int modifyBoard(Board board);
	
	public abstract int removeBoard(int bid);	

}
