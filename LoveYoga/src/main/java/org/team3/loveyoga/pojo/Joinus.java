package org.team3.loveyoga.pojo;

public class Joinus {
	private Integer yj_id;
	private String yj_messag;
	private Integer	yj_flag;
	private Integer	ygid;
	public Integer getYj_id() {
		return yj_id;
	}
	public void setYj_id(Integer yj_id) {
		this.yj_id = yj_id;
	}
	public String getYj_messag() {
		return yj_messag;
	}
	public void setYj_messag(String yj_messag) {
		this.yj_messag = yj_messag;
	}
	public Integer getYj_flag() {
		return yj_flag;
	}
	public void setYj_flag(Integer yj_flag) {
		this.yj_flag = yj_flag;
	}
	public Integer getYgid() {
		return ygid;
	}
	public void setYgid(Integer ygid) {
		this.ygid = ygid;
	}
	public Joinus(Integer yj_id, String yj_messag, Integer yj_flag, Integer ygid) {
		super();
		this.yj_id = yj_id;
		this.yj_messag = yj_messag;
		this.yj_flag = yj_flag;
		this.ygid = ygid;
	}
	public Joinus() {
		super();
	}
	@Override
	public String toString() {
		return "Joinus [yj_id=" + yj_id + ", yj_messag=" + yj_messag
				+ ", yj_flag=" + yj_flag + ", ygid=" + ygid + "]";
	}
	
}
