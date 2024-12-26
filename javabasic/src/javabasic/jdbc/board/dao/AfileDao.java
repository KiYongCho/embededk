package javabasic.jdbc.board.dao;

import java.util.List;

import javabasic.jdbc.board.model.Afile;

public interface AfileDao {

	public abstract List<Afile> listAfile();
	
	public abstract Afile getAfile(int afid);
	
	public abstract int registAfile(Afile afile);
	
	public abstract int modifyAfile(Afile afile);
	
	public abstract int removeAfile(int afid);	
	
}
