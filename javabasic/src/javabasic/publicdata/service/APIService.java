package javabasic.publicdata.service;

import java.util.List;

import com.google.gson.JsonElement;

public interface APIService {
	
	public abstract void initData(List<JsonElement> list);
	
	public abstract List<JsonElement> getList();

}
