package org.team3.loveyoga.pojo;

public class Foucs {
	private Integer	yf_id;
	private Integer yuid;
	private Integer ygid;
	private Integer yf_flag;
	public Integer getYf_id() {
		return yf_id;
	}
	public void setYf_id(Integer yf_id) {
		this.yf_id = yf_id;
	}
	public Integer getYuid() {
		return yuid;
	}
	public void setYuid(Integer yuid) {
		this.yuid = yuid;
	}
	public Integer getYgid() {
		return ygid;
	}
	public void setYgid(Integer ygid) {
		this.ygid = ygid;
	}
	public Integer getYf_flag() {
		return yf_flag;
	}
	public void setYf_flag(Integer yf_flag) {
		this.yf_flag = yf_flag;
	}
	@Override
	public String toString() {
		return "Foucs [yf_id=" + yf_id + ", yuid=" + yuid + ", ygid=" + ygid
				+ ", yf_flag=" + yf_flag + "]";
	}
	public Foucs(Integer yf_id, Integer yuid, Integer ygid, Integer yf_flag) {
		super();
		this.yf_id = yf_id;
		this.yuid = yuid;
		this.ygid = ygid;
		this.yf_flag = yf_flag;
	}
	public Foucs() {
		super();
	}
	
}
