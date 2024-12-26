package javabasic.jdbc.board.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabasic.jdbc.board.dao.AfileDao;
import javabasic.jdbc.board.model.Afile;
import javabasic.jdbc.board.util.ConnectionUtil;

public class AfileDaoImpl implements AfileDao {
	
	static ConnectionUtil connectionUtil = ConnectionUtil.getConnectionUtil();
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public AfileDaoImpl() {
		conn = connectionUtil.getConnection();
	}

	@Override
	public List<Afile> listAfile() {
		String sql = " select afid, afsfname, afcfname, afregdate, afdelyn, aid from afile order by afid desc ";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			List<Afile> afileList = new ArrayList<Afile>();
			if (rs!=null) {
				while (rs.next()) {
					Afile afile = new Afile();
					afile.setAfid(rs.getInt("afid"));
					afile.setAfsfname(rs.getString("afsfname"));
					afile.setAfcfname(rs.getString("afcfname"));
					afile.setAfregdate(rs.getTimestamp("afregdate"));
					afile.setAfdelyn(rs.getString("afdelyn"));
					afile.setAid(rs.getInt("aid"));
					afileList.add(afile);
				}
				return afileList;
			} else {
				return null;
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return null;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
		
	}

	@Override
	public Afile getAfile(int afid) {
		String sql = " select afid, afsfname, afcfname, afregdate, afdelyn, aid from afile where afid=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, afid);
			rs = pstmt.executeQuery();
			if (rs!=null && rs.next()) {
				Afile afile = new Afile();
				afile.setAfid(rs.getInt("afid"));
				afile.setAfsfname(rs.getString("afsfname"));
				afile.setAfcfname(rs.getString("afcfname"));
				afile.setAfregdate(rs.getTimestamp("afregdate"));
				afile.setAfdelyn(rs.getString("afdelyn"));
				afile.setAid(rs.getInt("aid"));
				return afile;
			} else {
				return null;
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return null;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

	@Override
	public int registAfile(Afile afile) {
		String sql = " insert into afile values(seq_afile.nextval, ?, ?, sysdate, 'N', ?) ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, afile.getAfsfname());
			pstmt.setString(2, afile.getAfcfname());
			pstmt.setInt(3, afile.getAid());
			return pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return 0;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

	@Override
	public int modifyAfile(Afile afile) {
		String sql = " update afile set afsfname=?, afcfname=?, afdelyn=? where afid=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, afile.getAfsfname());
			pstmt.setString(2, afile.getAfcfname());
			pstmt.setString(3,  afile.getAfdelyn());
			pstmt.setInt(4,  afile.getAfid());
			return pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return 0;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

	@Override
	public int removeAfile(int afid) {
		String sql = " delete afile where afid=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  afid);
			return pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return 0;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

}












