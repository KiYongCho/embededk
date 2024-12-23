package javabasic.jdbc;

import java.io.Serializable;

// Person 데이터 객체 (Data Object = Javabean = Value Object = Data Transfer Object)
public class Person implements Serializable {
	
	private static final long serealVersionUID = 23984789237894237L;
	
	private int pid;
	private String pname;
	private int page;
	
	public Person() {
	}

	public Person(int pid, String pname, int page) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", page=" + page + "]";
	}
	
} // class
