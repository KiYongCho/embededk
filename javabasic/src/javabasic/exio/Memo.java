package javabasic.exio;

import java.io.Serializable;

public class Memo implements Serializable {
	
	private static final long serialVersionUID = 32894789327493288L;
	
	private int no;
	private String content;
	
	public Memo() {
	}

	public Memo(int no, String content) {
		this.no = no;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "번호:"+no+", 내용:"+content;
	}

}
