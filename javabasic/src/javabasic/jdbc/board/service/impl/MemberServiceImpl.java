package javabasic.jdbc.board.service.impl;

import java.util.List;

import javabasic.jdbc.board.dao.MemberDao;
import javabasic.jdbc.board.dao.impl.MemberDaoImpl;
import javabasic.jdbc.board.model.Member;
import javabasic.jdbc.board.service.MemberService;

public class MemberServiceImpl implements MemberService {
	
	private MemberDao memberDao = new MemberDaoImpl();

	public MemberServiceImpl() {
	}

	@Override
	public List<Member> listMember() {
		return memberDao.listMember();
	}

	@Override
	public Member getMember(String mid) {
		return memberDao.getMember(mid);
	}

	@Override
	public int registMember(Member member) {
		return memberDao.registMember(member);
	}

	@Override
	public int modifyMember(Member member) {
		return memberDao.modifyMember(member);
	}

	@Override
	public int removeMember(String mid) {
		return memberDao.removeMember(mid);
	}

}
