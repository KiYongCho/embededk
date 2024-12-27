package javabasic.publicdata.service.impl;

import java.util.List;

import com.google.gson.JsonElement;

import javabasic.publicdata.dao.APIDao;
import javabasic.publicdata.dao.impl.APIDaoImpl;
import javabasic.publicdata.service.APIService;

public class APIServiceImpl implements APIService {
	
	private APIDao daoImpl;
	
	public APIServiceImpl() {
		daoImpl = new APIDaoImpl();
	}
	
	@Override
	public void initData(List<JsonElement> list) {
		daoImpl.initData(list);		
	}

	@Override
	public List<JsonElement> getList() {
		return daoImpl.getList();
	}

}
