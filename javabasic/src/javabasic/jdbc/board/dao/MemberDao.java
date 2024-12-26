package javabasic.jdbc.board.dao;

import java.util.List;

import javabasic.jdbc.board.model.Member;

public interface MemberDao {
	
	public abstract List<Member> listMember();
	
	public abstract Member getMember(String mid);
	
	public abstract int registMember(Member member);
	
	public abstract int modifyMember(Member member);
	
	public abstract int removeMember(String mid);	

}
