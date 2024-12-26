package javabasic.jdbc.board.service.impl;

import java.util.List;

import javabasic.jdbc.board.dao.AfileDao;
import javabasic.jdbc.board.dao.impl.AfileDaoImpl;
import javabasic.jdbc.board.model.Afile;
import javabasic.jdbc.board.service.AfileService;

public class AfileServiceImpl implements AfileService {
	
	private AfileDao afileDao;
	
	public AfileServiceImpl() {
		afileDao = new AfileDaoImpl();
	}

	@Override
	public List<Afile> listAfile() {
		return afileDao.listAfile();
	}

	@Override
	public Afile getAfile(int afid) {
		return afileDao.getAfile(afid);
	}

	@Override
	public int registAfile(Afile afile) {
		return afileDao.registAfile(afile);
	}

	@Override
	public int modifyAfile(Afile afile) {
		return afileDao.modifyAfile(afile);
	}

	@Override
	public int removeAfile(int afid) {
		return afileDao.removeAfile(afid);
	}

}
