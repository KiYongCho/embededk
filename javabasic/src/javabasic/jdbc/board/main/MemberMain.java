package javabasic.jdbc.board.main;

import javabasic.jdbc.board.service.MemberService;
import javabasic.jdbc.board.service.impl.MemberServiceImpl;

public class MemberMain {
	
	public static void main(String[] args) {
		
		MemberService memberService = new MemberServiceImpl();

		// listMember
		// System.out.println(memberService.listMember());
		
		// getMember
		// System.out.println(memberService.getMember("HONG"));
		
		// registMember
		// memberService.registMember(new Member("JANG", "JANG", "장보고", null, null));
		
		// modifyMember
		// memberService.modifyMember(new Member("JANG", "NEWJANG", "뉴장보고", null, "N"));
		
		// removeMember
		memberService.removeMember("JANG");
		
	}

}


























