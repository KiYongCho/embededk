package javabasic.jdbc.board.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabasic.jdbc.board.dao.ArticleDao;
import javabasic.jdbc.board.model.Article;
import javabasic.jdbc.board.util.ConnectionUtil;

public class ArticleDaoImpl implements ArticleDao {
	
	static ConnectionUtil connectionUtil = ConnectionUtil.getConnectionUtil();
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public ArticleDaoImpl() {
		conn = connectionUtil.getConnection();
	}

	@Override
	public List<Article> listArticle() {
		String sql = " select aid, atitle, acontent, aregdate, acount, afcount, adelyn, mid, bid "
				+ " from article order by aid desc ";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			List<Article> articleList = new ArrayList<Article>();
			if (rs!=null) {
				while (rs.next()) {
					Article article = new Article();
					article.setAid(rs.getInt("aid"));
					article.setAtitle(rs.getString("atitle"));
					article.setAcontent(rs.getString("acontent"));
					article.setAregdate(rs.getTimestamp("aregdate"));
					article.setAcount(rs.getInt("acount"));
					article.setAfcount(rs.getInt("afcount"));
					article.setAdelyn(rs.getString("adelyn"));
					article.setMid(rs.getString("mid"));
					article.setBid(rs.getInt("bid"));					
					articleList.add(article);
				}
				return articleList;
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
	public Article getArticle(int aid) {
		String sql = " select aid, atitle, acontent, aregdate, acount, afcount, adelyn, mid, bid "
				+ " from article where aid=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, aid);
			rs = pstmt.executeQuery();
			if (rs!=null && rs.next()) {
				Article article = new Article();
				article.setAid(rs.getInt("aid"));
				article.setAtitle(rs.getString("atitle"));
				article.setAcontent(rs.getString("acontent"));
				article.setAregdate(rs.getTimestamp("aregdate"));
				article.setAcount(rs.getInt("acount"));
				article.setAfcount(rs.getInt("afcount"));
				article.setAdelyn(rs.getString("adelyn"));
				article.setMid(rs.getString("mid"));
				article.setBid(rs.getInt("bid"));
				return article;
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
	public int registArticle(Article article) {
		String sql = " insert into article values " 
				+ " (seq_article.nextval, ?, ?, sysdate, 0, 0, 'N', ?, ?) ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getAtitle());
			pstmt.setString(2, article.getAcontent());
			pstmt.setString(3,  article.getMid());
			pstmt.setInt(4,  article.getBid());
			return pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return 0;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

	@Override
	public int modifyArticle(Article article) {
		String sql = " update article set "
				+ " atitle=?, acontent=?, adelyn=? where aid=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getAtitle());
			pstmt.setString(2, article.getAcontent());
			pstmt.setString(3,  article.getAdelyn());
			pstmt.setInt(4,  article.getAid());
			return pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return 0;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

	@Override
	public int removeArticle(int aid) {
		String sql = " delete article where aid=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  aid);
			return pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return 0;
		} finally {
			connectionUtil.closeAll(rs, pstmt, conn);
		}
	}

}












