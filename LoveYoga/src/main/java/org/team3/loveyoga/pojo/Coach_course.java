package org.team3.loveyoga.pojo;

public class Coach_course {
	private Integer	ycc_cid;
	private Integer	ycc_gcid;
	public Integer getYcc_cid() {
		return ycc_cid;
	}
	public void setYcc_cid(Integer ycc_cid) {
		this.ycc_cid = ycc_cid;
	}
	public Integer getYcc_gcid() {
		return ycc_gcid;
	}
	public void setYcc_gcid(Integer ycc_gcid) {
		this.ycc_gcid = ycc_gcid;
	}
	public Coach_course(Integer ycc_cid, Integer ycc_gcid) {
		super();
		this.ycc_cid = ycc_cid;
		this.ycc_gcid = ycc_gcid;
	}
	public Coach_course() {
		super();
	}
	@Override
	public String toString() {
		return "Coach_course [ycc_cid=" + ycc_cid + ", ycc_gcid=" + ycc_gcid
				+ "]";
	}
	
}
