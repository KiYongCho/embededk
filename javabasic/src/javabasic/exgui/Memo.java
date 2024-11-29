package javabasic.exgui;

// Level 1 : 기본 UI구성

public class Memo {
	
	private int no; // 메모 번호
	private String subject; // 메모 제목
	private String content; // 메모 내용
	
	public Memo() {
	}

	public Memo(int no, String subject, String content) {
		this.no = no;
		this.subject = subject;
		this.content = content;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "[" + (no+1) + "] " + subject;
	}

}










