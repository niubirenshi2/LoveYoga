package org.team3.loveyoga.pojo;

public class Gym_course {
	private	Integer	ygc_id;
	private	String	ygc_name;
	private	String	ygc_content;
	private Integer	ygc_ygid;
	public Integer getYgc_id() {
		return ygc_id;
	}
	public void setYgc_id(Integer ygc_id) {
		this.ygc_id = ygc_id;
	}
	public String getYgc_name() {
		return ygc_name;
	}
	public void setYgc_name(String ygc_name) {
		this.ygc_name = ygc_name;
	}
	public String getYgc_content() {
		return ygc_content;
	}
	public void setYgc_content(String ygc_content) {
		this.ygc_content = ygc_content;
	}
	public Integer getYgc_ygid() {
		return ygc_ygid;
	}
	public void setYgc_ygid(Integer ygc_ygid) {
		this.ygc_ygid = ygc_ygid;
	}
	public Gym_course(Integer ygc_id, String ygc_name, String ygc_content,
			Integer ygc_ygid) {
		super();
		this.ygc_id = ygc_id;
		this.ygc_name = ygc_name;
		this.ygc_content = ygc_content;
		this.ygc_ygid = ygc_ygid;
	}
	public Gym_course() {
		super();
	}
	@Override
	public String toString() {
		return "Gym_course [ygc_id=" + ygc_id + ", ygc_name=" + ygc_name
				+ ", ygc_content=" + ygc_content + ", ygc_ygid=" + ygc_ygid
				+ "]";
	}
	
}
