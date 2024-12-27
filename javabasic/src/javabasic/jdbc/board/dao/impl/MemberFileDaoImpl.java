package javabasic.jdbc.board.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

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
		gson = new GsonBuilder().setPrettyPrinting().create();
		memberMap = getMemberMap();
	}

	@Override
	public List<Member> listMember() {
		Iterator<String> it = getMemberMap().keySet().iterator();
		List<Member> memberList = new ArrayList<Member>();
		while (it.hasNext()) {
			memberList.add((Member)memberMap.get(it.next()));
		}
		return memberList;			
	}

	@Override
	public Member getMember(String mid) {
		return (Member)getMemberMap().get(mid);
	}

	@Override
	public int registMember(Member member) {
		memberMap.put(member.getMid(), member);
		setMemberMap();
		return 1;
	}

	@Override
	public int modifyMember(Member member) {
		memberMap.remove(member.getMid());
		registMember(member);
		setMemberMap();
		return 1;
	}

	@Override
	public int removeMember(String mid) {
		memberMap.remove(mid);
		setMemberMap();
		return 1;
	}
	
	private Map<String, Member> getMemberMap() {
		try {
			br = new BufferedReader(new FileReader(file));
			String line = "";
			String jsonStr = "";
			while ((line=br.readLine())!=null) {
				jsonStr += line;
			}
			return gson.fromJson(jsonStr, 
						new TypeToken<Map<String, Member>>() {}.getType());
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		} finally {
			try {
				if (br!=null) br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	
	private void setMemberMap() {
		try {
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(gson.toJson(memberMap));
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw!=null) bw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}	

} // class












