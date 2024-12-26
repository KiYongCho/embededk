package javabasic.jdbc.board.service;

import java.util.List;

import javabasic.jdbc.board.model.Afile;

public interface AfileService {
	
	public abstract List<Afile> listAfile();
	
	public abstract Afile getAfile(int afid);
	
	public abstract int registAfile(Afile afile);
	
	public abstract int modifyAfile(Afile afile);
	
	public abstract int removeAfile(int afid);

}











