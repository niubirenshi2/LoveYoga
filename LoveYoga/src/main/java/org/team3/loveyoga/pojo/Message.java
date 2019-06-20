package org.team3.loveyoga.pojo;

import java.util.Date;

public class Message {
	private int ym_id;
	private int ym_sid;
	private int ym_cid;
	private String ym_message;
	private String ym_form;
	private Date ym_createtime;
	public int getYm_id() {
		return ym_id;
	}
	public void setYm_id(int ym_id) {
		this.ym_id = ym_id;
	}
	public int getYm_sid() {
		return ym_sid;
	}
	public void setYm_sid(int ym_sid) {
		this.ym_sid = ym_sid;
	}
	public int getYm_cid() {
		return ym_cid;
	}
	public void setYm_cid(int ym_cid) {
		this.ym_cid = ym_cid;
	}
	public String getYm_message() {
		return ym_message;
	}
	public void setYm_message(String ym_message) {
		this.ym_message = ym_message;
	}
	public String getYm_form() {
		return ym_form;
	}
	public void setYm_form(String ym_form) {
		this.ym_form = ym_form;
	}
	public Date getYm_createtime() {
		return ym_createtime;
	}
	public void setYm_createtime(Date ym_createtime) {
		this.ym_createtime = ym_createtime;
	}
	public Message(int ym_id, int ym_sid, int ym_cid, String ym_message, String ym_form, Date ym_createtime) {
		super();
		this.ym_id = ym_id;
		this.ym_sid = ym_sid;
		this.ym_cid = ym_cid;
		this.ym_message = ym_message;
		this.ym_form = ym_form;
		this.ym_createtime = ym_createtime;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Message [ym_id=" + ym_id + ", ym_sid=" + ym_sid + ", ym_cid=" + ym_cid + ", ym_message=" + ym_message
				+ ", ym_form=" + ym_form + ", ym_createtime=" + ym_createtime + "]";
	}
	
}
