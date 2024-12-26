package javabasic.jdbc.board.service.impl;

import java.util.List;

import javabasic.jdbc.board.dao.ReplyDao;
import javabasic.jdbc.board.dao.impl.ReplyDaoImpl;
import javabasic.jdbc.board.model.Reply;
import javabasic.jdbc.board.service.ReplyService;

public class ReplyServiceImpl implements ReplyService {
	
	private ReplyDao replyDao;
	
	public ReplyServiceImpl() {
		replyDao = new ReplyDaoImpl();
	}

	@Override
	public List<Reply> listReply() {
		return replyDao.listReply();
	}

	@Override
	public Reply getReply(int rid) {
		return replyDao.getReply(rid);
	}

	@Override
	public int registReply(Reply reply) {
		return replyDao.registReply(reply);
	}

	@Override
	public int modifyReply(Reply reply) {
		return replyDao.modifyReply(reply);
	}

	@Override
	public int removeReply(int rid) {
		return replyDao.removeReply(rid);
	}

}
