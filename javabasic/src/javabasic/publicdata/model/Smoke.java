package javabasic.publicdata.model;

public class Smoke {

	private int sid;
	private String orgname;
	private String orgtel;
	private int orgyear;
	private String datadate;
	private String sigungu;
	private int dscount;
	private int mwcount;

	public Smoke() {
	}

	public Smoke(int sid, String orgname, String orgtel, int orgyear, String datadate, String sigungu, int dscount,
			int mwcount) {
		this.sid = sid;
		this.orgname = orgname;
		this.orgtel = orgtel;
		this.orgyear = orgyear;
		this.datadate = datadate;
		this.sigungu = sigungu;
		this.dscount = dscount;
		this.mwcount = mwcount;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public String getOrgtel() {
		return orgtel;
	}

	public void setOrgtel(String orgtel) {
		this.orgtel = orgtel;
	}

	public int getOrgyear() {
		return orgyear;
	}

	public void setOrgyear(int orgyear) {
		this.orgyear = orgyear;
	}

	public String getDatadate() {
		return datadate;
	}

	public void setDatadate(String datadate) {
		this.datadate = datadate;
	}

	public String getSigungu() {
		return sigungu;
	}

	public void setSigungu(String sigungu) {
		this.sigungu = sigungu;
	}

	public int getDscount() {
		return dscount;
	}

	public void setDscount(int dscount) {
		this.dscount = dscount;
	}

	public int getMwcount() {
		return mwcount;
	}

	public void setMwcount(int mwcount) {
		this.mwcount = mwcount;
	}

	@Override
	public String toString() {
		return "Smoke [sid=" + sid + ", orgname=" + orgname + ", orgtel=" + orgtel + ", orgyear=" + orgyear
				+ ", datadate=" + datadate + ", sigungu=" + sigungu + ", dscount=" + dscount + ", mwcount=" + mwcount
				+ "]";
	}

}
