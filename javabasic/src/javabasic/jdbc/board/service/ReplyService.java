package javabasic.jdbc.board.service;

import java.util.List;

import javabasic.jdbc.board.model.Reply;

public interface ReplyService {
	
	public abstract List<Reply> listReply();
	
	public abstract Reply getReply(int rid);
	
	public abstract int registReply(Reply reply);
	
	public abstract int modifyReply(Reply reply);
	
	public abstract int removeReply(int rid);

}







