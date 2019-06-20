package org.team3.loveyoga.pojo;

public class Gym {
	private Integer yg_id;
	private String yg_name;
	private String yg_tel;
	private String	yg_qq;
	private	Integer	yg_flag;
	private String	yg_description;
	private String yg_img;
	private String yg_address;
	private Integer yuid;
	private String yg_plan;
	private	String yg_account;
	
	public String getYg_qq() {
		return yg_qq;
	}
	public void setYg_qq(String yg_qq) {
		this.yg_qq = yg_qq;
	}
	public Integer getYg_id() {
		return yg_id;
	}
	public void setYg_id(Integer yg_id) {
		this.yg_id = yg_id;
	}
	public String getYg_name() {
		return yg_name;
	}
	public void setYg_name(String yg_name) {
		this.yg_name = yg_name;
	}
	public String getYg_tel() {
		return yg_tel;
	}
	public void setYg_tel(String yg_tel) {
		this.yg_tel = yg_tel;
	}
	public Integer getYg_flag() {
		return yg_flag;
	}
	public void setYg_flag(Integer yg_flag) {
		this.yg_flag = yg_flag;
	}
	public String getYg_description() {
		return yg_description;
	}
	public void setYg_description(String yg_description) {
		this.yg_description = yg_description;
	}
	public String getYg_img() {
		return yg_img;
	}
	public void setYg_img(String yg_img) {
		this.yg_img = yg_img;
	}
	public String getYg_address() {
		return yg_address;
	}
	public void setYg_address(String yg_address) {
		this.yg_address = yg_address;
	}
	public Integer getYuid() {
		return yuid;
	}
	public void setYuid(Integer yuid) {
		this.yuid = yuid;
	}
	public String getYg_plan() {
		return yg_plan;
	}
	public void setYg_plan(String yg_plan) {
		this.yg_plan = yg_plan;
	}
	public String getYg_account() {
		return yg_account;
	}
	public void setYg_account(String yg_account) {
		this.yg_account = yg_account;
	}
	public Gym(Integer yg_id, String yg_name, String yg_tel, String yg_qq,
			Integer yg_flag, String yg_description, String yg_img,
			String yg_address, Integer yuid, String yg_plan, String yg_account) {
		super();
		this.yg_id = yg_id;
		this.yg_name = yg_name;
		this.yg_tel = yg_tel;
		this.yg_qq = yg_qq;
		this.yg_flag = yg_flag;
		this.yg_description = yg_description;
		this.yg_img = yg_img;
		this.yg_address = yg_address;
		this.yuid = yuid;
		this.yg_plan = yg_plan;
		this.yg_account = yg_account;
	}
	public Gym() {
		super();
	}
	@Override
	public String toString() {
		return "Gym [yg_id=" + yg_id + ", yg_name=" + yg_name + ", yg_tel="
				+ yg_tel + ", yg_qq=" + yg_qq + ", yg_flag=" + yg_flag
				+ ", yg_description=" + yg_description + ", yg_img=" + yg_img
				+ ", yg_address=" + yg_address + ", yuid=" + yuid
				+ ", yg_plan=" + yg_plan + ", yg_account=" + yg_account + "]";
	}
	
}
