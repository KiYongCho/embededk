package javabasic.jdbc.board.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Reply implements Serializable {
	
	private static final long serialVersionUID = 328947329478932L;
	
	private int rid;
	private String rcontent;
	private Timestamp rregdate;
	private String rdelyn;
	private int aid;
	private String mid;
	
	public Reply() {
	}

	public Reply(int rid, String rcontent, Timestamp rregdate, String rdelyn, int aid, String mid) {
		super();
		this.rid = rid;
		this.rcontent = rcontent;
		this.rregdate = rregdate;
		this.rdelyn = rdelyn;
		this.aid = aid;
		this.mid = mid;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public Timestamp getRregdate() {
		return rregdate;
	}

	public void setRregdate(Timestamp rregdate) {
		this.rregdate = rregdate;
	}

	public String getRdelyn() {
		return rdelyn;
	}

	public void setRdelyn(String rdelyn) {
		this.rdelyn = rdelyn;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "Reply [rid=" + rid + ", rcontent=" + rcontent + ", rregdate=" + rregdate + ", rdelyn=" + rdelyn
				+ ", aid=" + aid + ", mid=" + mid + "]";
	}
	
}














