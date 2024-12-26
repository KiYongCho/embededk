package javabasic.jdbc.board.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabasic.jdbc.board.dao.MemberDao;
import javabasic.jdbc.board.model.Member;
import javabasic.jdbc.board.util.ConnectionUtil;

public class MemberDaoImpl implements MemberDao {
	
	static ConnectionUtil connectionUtil = ConnectionUtil.getConnectionUtil();
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public MemberDaoImpl() {
		conn = connectionUtil.getConnection();
	}

	@Override
	public List<Member> listMember() {
		String sql = " select mid, mpass, mname, mregdate, mdelyn "
				+ " from member order by mid desc ";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			List<Member> memberList = new ArrayList<Member>();
			if (rs!=null) {
				while (rs.next()) {
					Member member = new Member();
					member.setMid(rs.getString("mid"));
					member.setMpass(rs.getString("mpass"));
					member.setMname(rs.getString("mname"));
					member.setMregdate(rs.getTimestamp("mregdate"));
					member.setMdelyn(rs.getString("mdelyn"));
					memberList.add(member);
				}
				return memberList;
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
	public Member getMember(String mid) {
		String sql = " select mid, mpass, mname, mregdate, mdelyn "
				+ " from member where mid=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			rs = pstmt.executeQuery();
			if (rs!=null && rs.next()) {
				Member member = new Member();
				member.setMid(rs.getString("mid"));
				member.setMpass(rs.getString("mpass"));
				member.setMname(rs.getString("mname"));
				member.setMregdate(rs.getTimestamp("mregdate"));
				member.setMdelyn(rs.getString("mdelyn"));
				return member;
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
	public int registMember(Member member) {
		String sql = " insert into member values(?, ?, ?, sysdate, 'N') ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMid());
			pstmt.setString(2, member.getMpass());
			pstmt.setString(3,  member.getMname());
			return pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return 0;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

	@Override
	public int modifyMember(Member member) {
		String sql = " update member set mname=?, mpass=?, mdelyn=? where mid=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMname());
			pstmt.setString(2, member.getMpass());
			pstmt.setString(3,  member.getMdelyn());
			pstmt.setString(4,  member.getMid());
			return pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return 0;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

	@Override
	public int removeMember(String mid) {
		String sql = " delete member where mid=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  mid);
			return pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return 0;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

}












