package javabasic.jdbc.board.main;

import javabasic.jdbc.board.service.ReplyService;
import javabasic.jdbc.board.service.impl.ReplyServiceImpl;

public class ReplyMain {

	public static void main(String[] args) {
		
		ReplyService replyService = new ReplyServiceImpl();
		
		// System.out.println(replyService.listReply());
		
		// System.out.println(replyService.getReply(1));
		
		// replyService.registReply(new Reply(0, "댓글", null, "N", 1, "HONG"));
		
		// replyService.modifyReply(new Reply(21, "뉴댓글", null, "Y", 1, "HONG"));
		
		replyService.removeReply(21);
		
	}
	
}







