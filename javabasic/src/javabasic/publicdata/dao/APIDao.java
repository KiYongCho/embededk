package javabasic.publicdata.dao;

import java.util.List;

import com.google.gson.JsonElement;

public interface APIDao {
	
	public abstract void initData(List<JsonElement> list);
	
	public abstract List<JsonElement> getList();

}
