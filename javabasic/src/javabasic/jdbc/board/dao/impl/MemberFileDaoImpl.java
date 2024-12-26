package javabasic.jdbc.board.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javabasic.jdbc.board.dao.MemberDao;
import javabasic.jdbc.board.model.Member;

public class MemberFileDaoImpl implements MemberDao {
	
	File file;
	BufferedReader br;
	BufferedWriter bw;
	Gson gson;
	
	private static Map<String, Member> memberMap
	= new HashMap<String, Member>();	
	
	public MemberFileDaoImpl() {
		file = new File("D:/embededk/files/member.json");
		gson = new GsonBuilder().create();
	}

	@Override
	public List<Member> listMember() {
		return null;
	}

	@Override
	public Member getMember(String mid) {
		return (Member)(memberMap.get(mid));
	}

	@Override
	public int registMember(Member member) {
		memberMap.put(member.getMid(), member);
		String jsonStr = gson.toJson(memberMap);
		try {
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(jsonStr);
			bw.flush();
			return 1;
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			return 0;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return 0;
		} finally {
			try {
				if (bw!=null) bw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

	@Override
	public int modifyMember(Member member) {
		return 0;
	}

	@Override
	public int removeMember(String mid) {
		return 0;
	}

}












