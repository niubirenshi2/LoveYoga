package org.team3.loveyoga.pojo;

public class User {
	private int yu_id;
	private String yu_tel;
	private String yu_password;
	private String yu_name;
	private String yu_email;
	private int yu_rid;
	private int flag;
	public int getYu_id() {
		return yu_id;
	}
	public void setYu_id(int yu_id) {
		this.yu_id = yu_id;
	}
	public String getYu_tel() {
		return yu_tel;
	}
	public void setYu_tel(String yu_tel) {
		this.yu_tel = yu_tel;
	}
	public String getYu_password() {
		return yu_password;
	}
	public void setYu_password(String yu_password) {
		this.yu_password = yu_password;
	}
	public String getYu_name() {
		return yu_name;
	}
	public void setYu_name(String yu_name) {
		this.yu_name = yu_name;
	}
	public String getYu_email() {
		return yu_email;
	}
	public void setYu_email(String yu_email) {
		this.yu_email = yu_email;
	}
	public int getYu_rid() {
		return yu_rid;
	}
	public void setYu_rid(int yu_rid) {
		this.yu_rid = yu_rid;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Y_user [yu_id=" + yu_id + ", yu_tel=" + yu_tel + ", yu_password=" + yu_password + ", yu_name=" + yu_name
				+ ", yu_email=" + yu_email + ", yu_rid=" + yu_rid + ", flag=" + flag + "]";
	}
	public User(int yu_id, String yu_tel, String yu_password, String yu_name, String yu_email, int yu_rid, int flag) {
		super();
		this.yu_id = yu_id;
		this.yu_tel = yu_tel;
		this.yu_password = yu_password;
		this.yu_name = yu_name;
		this.yu_email = yu_email;
		this.yu_rid = yu_rid;
		this.flag = flag;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
