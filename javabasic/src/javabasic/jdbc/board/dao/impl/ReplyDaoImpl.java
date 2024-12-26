package javabasic.jdbc.board.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabasic.jdbc.board.dao.ReplyDao;
import javabasic.jdbc.board.model.Reply;
import javabasic.jdbc.board.util.ConnectionUtil;

public class ReplyDaoImpl implements ReplyDao {
	
	static ConnectionUtil connectionUtil = ConnectionUtil.getConnectionUtil();
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public ReplyDaoImpl() {
		conn = connectionUtil.getConnection();
	}

	@Override
	public List<Reply> listReply() {
		String sql = " select rid, rcontent, rregdate, rdelyn, aid, mid from reply order by rid desc ";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			List<Reply> replyList = new ArrayList<Reply>();
			if (rs!=null) {
				while (rs.next()) {
					Reply reply = new Reply();
					reply.setRid(rs.getInt("rid"));
					reply.setRcontent(rs.getString("rcontent"));
					reply.setRregdate(rs.getTimestamp("rregdate"));
					reply.setRdelyn(rs.getString("rdelyn"));
					reply.setAid(rs.getInt("aid"));
					reply.setMid(rs.getString("mid"));
					replyList.add(reply);
				}
				return replyList;
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
	public Reply getReply(int rid) {
		String sql = " select rid, rcontent, rregdate, rdelyn, aid, mid from reply where rid=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rid);
			rs = pstmt.executeQuery();
			if (rs!=null && rs.next()) {
				Reply reply = new Reply();
				reply.setRid(rs.getInt("rid"));
				reply.setRcontent(rs.getString("rcontent"));
				reply.setRregdate(rs.getTimestamp("rregdate"));
				reply.setRdelyn(rs.getString("rdelyn"));
				reply.setAid(rs.getInt("aid"));
				reply.setMid(rs.getString("mid"));
				return reply;
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
	public int registReply(Reply reply) {
		String sql = " insert into reply values(seq_reply.nextval, ?, sysdate, 'N', ?, ?) ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, reply.getRcontent());
			pstmt.setInt(2, reply.getAid());
			pstmt.setString(3,  reply.getMid());
			return pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return 0;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

	@Override
	public int modifyReply(Reply reply) {
		String sql = " update reply set rcontent=?, rdelyn=? where rid=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, reply.getRcontent());
			pstmt.setString(2, reply.getRdelyn());
			pstmt.setInt(3,  reply.getRid());
			return pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return 0;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

	@Override
	public int removeReply(int rid) {
		String sql = " delete reply where rid=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  rid);
			return pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return 0;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

}












