package javabasic.publicdata.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import javabasic.publicdata.dao.APIDao;
import javabasic.publicdata.model.Smoke;
import javabasic.publicdata.util.ConnectionUtil;

public class APIDaoImpl implements APIDao {
	
	static ConnectionUtil connectionUtil;
	Connection conn;
	
	public APIDaoImpl() {
		connectionUtil = ConnectionUtil.getConnectionUtil();
	}
	
	@Override
	public void initData(List<JsonElement> list) {
		
	}

	@Override
	public List<JsonElement> getList() {
		conn = connectionUtil.getConnection();
		String sql = " select sid,orgname,orgtel,orgyear,datadate,sigungu,dscount,mwcount "
				+ " from smoke order by sid desc ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			Gson gson = new GsonBuilder().create();
			List<JsonElement> list = new ArrayList<JsonElement>(); 
			while (rs.next()) {
				Smoke smoke = new Smoke();
				smoke.setSid(rs.getInt("sid"));
				smoke.setOrgname(rs.getString("orgname"));
				smoke.setOrgtel(rs.getString("orgtel"));
				smoke.setOrgyear(rs.getInt("orgyear"));
				smoke.setDatadate(rs.getString("datadate"));
				smoke.setSigungu(rs.getString("sigungu"));
				smoke.setDscount(rs.getInt("dscount"));
				smoke.setDscount(rs.getInt("mwcount"));
				list.add(gson.toJsonTree(smoke));
			}
			return list;
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return null;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}
	
	

} // class









