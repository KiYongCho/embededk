package javabasic.jdbc.board.main;

import java.sql.Timestamp;

import javabasic.jdbc.board.model.Member;
import javabasic.jdbc.board.service.MemberService;
import javabasic.jdbc.board.service.impl.MemberFileServiceImpl;

public class MemberFileMain {
	
	public static void main(String[] args) {
		
		MemberService memberService = new MemberFileServiceImpl();
		
		Member member = new Member("CHOI", "CHOI", "최영", 
				new Timestamp(System.currentTimeMillis()), "N"); 
		memberService.registMember(member);
		
		System.out.println(memberService.getMember("CHOI"));
		
	}

}








