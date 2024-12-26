package javabasic.jdbc.board.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Member implements Serializable {

	private static final long serialVersionUID = 2398478932478923L;
	
	private String mid;
	private String mpass;
	private String mname;
	private Timestamp mregdate;
	private String mdelyn;
	
	public Member() {
	}

	public Member(String mid, String mpass, String mname, Timestamp mregdate, String mdelyn) {
		super();
		this.mid = mid;
		this.mpass = mpass;
		this.mname = mname;
		this.mregdate = mregdate;
		this.mdelyn = mdelyn;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpass() {
		return mpass;
	}

	public void setMpass(String mpass) {
		this.mpass = mpass;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Timestamp getMregdate() {
		return mregdate;
	}

	public void setMregdate(Timestamp mregdate) {
		this.mregdate = mregdate;
	}

	public String getMdelyn() {
		return mdelyn;
	}

	public void setMdelyn(String mdelyn) {
		this.mdelyn = mdelyn;
	}

	@Override
	public String toString() {
		return "Member [mid=" + mid + ", mpass=" + mpass + ", mname=" + mname + ", mregdate=" + mregdate + ", mdelyn="
				+ mdelyn + "]";
	}
	
}








