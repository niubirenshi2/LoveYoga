package org.team3.loveyoga.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Student{
	private Integer ys_id;
	private String ys_name;
	private String ys_pwd;
	private String ys_qq;
	private String ys_tel;
	private String ys_nickname;
	private String ys_headimg;
	private String ys_email;
	private String ys_address;
	private BigDecimal ys_balance;
	private Date ys_createtime;
	private Date ys_updatetime;
	private Integer ys_state;
	private Integer ys_uid;
	private Integer yv_vid;
	private Integer yc_cid;
	private String ys_note;
	public Integer getYs_id() {
		return ys_id;
	}
	public void setYs_id(Integer ys_id) {
		this.ys_id = ys_id;
	}
	public String getYs_name() {
		return ys_name;
	}
	public void setYs_name(String ys_name) {
		this.ys_name = ys_name;
	}
	public String getYs_pwd() {
		return ys_pwd;
	}
	public void setYs_pwd(String ys_pwd) {
		this.ys_pwd = ys_pwd;
	}
	public String getYs_qq() {
		return ys_qq;
	}
	public void setYs_qq(String ys_qq) {
		this.ys_qq = ys_qq;
	}
	public String getYs_tel() {
		return ys_tel;
	}
	public void setYs_tel(String ys_tel) {
		this.ys_tel = ys_tel;
	}
	public String getYs_nickname() {
		return ys_nickname;
	}
	public void setYs_nickname(String ys_nickname) {
		this.ys_nickname = ys_nickname;
	}
	public String getYs_headimg() {
		return ys_headimg;
	}
	public void setYs_headimg(String ys_headimg) {
		this.ys_headimg = ys_headimg;
	}
	public String getYs_email() {
		return ys_email;
	}
	public void setYs_email(String ys_email) {
		this.ys_email = ys_email;
	}
	public String getYs_address() {
		return ys_address;
	}
	public void setYs_address(String ys_address) {
		this.ys_address = ys_address;
	}
	public BigDecimal getYs_balance() {
		return ys_balance;
	}
	public void setYs_balance(BigDecimal ys_balance) {
		this.ys_balance = ys_balance;
	}
	public Date getYs_createtime() {
		return ys_createtime;
	}
	public void setYs_createtime(Date ys_createtime) {
		this.ys_createtime = ys_createtime;
	}
	public Date getYs_updatetime() {
		return ys_updatetime;
	}
	public void setYs_updatetime(Date ys_updatetime) {
		this.ys_updatetime = ys_updatetime;
	}
	public Integer getYs_state() {
		return ys_state;
	}
	public void setYs_state(Integer ys_state) {
		this.ys_state = ys_state;
	}
	public Integer getYs_uid() {
		return ys_uid;
	}
	public void setYs_uid(Integer ys_uid) {
		this.ys_uid = ys_uid;
	}
	public Integer getYv_vid() {
		return yv_vid;
	}
	public void setYv_vid(Integer yv_vid) {
		this.yv_vid = yv_vid;
	}
	public Integer getYc_cid() {
		return yc_cid;
	}
	public void setYc_cid(Integer yc_cid) {
		this.yc_cid = yc_cid;
	}
	public String getYs_note() {
		return ys_note;
	}
	public void setYs_note(String ys_note) {
		this.ys_note = ys_note;
	}
	@Override
	public String toString() {
		return "Student [ys_id=" + ys_id + ", ys_name=" + ys_name + ", ys_pwd=" + ys_pwd + ", ys_qq=" + ys_qq
				+ ", ys_tel=" + ys_tel + ", ys_nickname=" + ys_nickname + ", ys_headimg=" + ys_headimg + ", ys_email="
				+ ys_email + ", ys_address=" + ys_address + ", ys_balance=" + ys_balance + ", ys_createtime="
				+ ys_createtime + ", ys_updatetime=" + ys_updatetime + ", ys_state=" + ys_state + ", ys_uid=" + ys_uid
				+ ", yv_vid=" + yv_vid + ", yc_cid=" + yc_cid + ", ys_note=" + ys_note + "]";
	}
	public Student(Integer ys_id, String ys_name, String ys_pwd, String ys_qq, String ys_tel, String ys_nickname,
			String ys_headimg, String ys_email, String ys_address, BigDecimal ys_balance, Date ys_createtime,
			Date ys_updatetime, Integer ys_state, Integer ys_uid, Integer yv_vid, Integer yc_cid, String ys_note) {
		super();
		this.ys_id = ys_id;
		this.ys_name = ys_name;
		this.ys_pwd = ys_pwd;
		this.ys_qq = ys_qq;
		this.ys_tel = ys_tel;
		this.ys_nickname = ys_nickname;
		this.ys_headimg = ys_headimg;
		this.ys_email = ys_email;
		this.ys_address = ys_address;
		this.ys_balance = ys_balance;
		this.ys_createtime = ys_createtime;
		this.ys_updatetime = ys_updatetime;
		this.ys_state = ys_state;
		this.ys_uid = ys_uid;
		this.yv_vid = yv_vid;
		this.yc_cid = yc_cid;
		this.ys_note = ys_note;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
}
