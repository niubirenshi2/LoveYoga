package org.team3.loveyoga.pojo;

import java.util.Date;

public class Circle {
	private int yc_id;
	private int yc_uid;
	private String yc_text;
	private String yc_img;
	private Date yc_createtime;
	private Date yc_deletetime;
	private int flag;
	public int getYc_id() {
		return yc_id;
	}
	public void setYc_id(int yc_id) {
		this.yc_id = yc_id;
	}
	public int getYc_uid() {
		return yc_uid;
	}
	public void setYc_uid(int yc_uid) {
		this.yc_uid = yc_uid;
	}
	public String getYc_text() {
		return yc_text;
	}
	public void setYc_text(String yc_text) {
		this.yc_text = yc_text;
	}
	public String getYc_img() {
		return yc_img;
	}
	public void setYc_img(String yc_img) {
		this.yc_img = yc_img;
	}
	public Date getYc_createtime() {
		return yc_createtime;
	}
	public void setYc_createtime(Date yc_createtime) {
		this.yc_createtime = yc_createtime;
	}
	public Date getYc_deletetime() {
		return yc_deletetime;
	}
	public void setYc_deletetime(Date yc_deletetime) {
		this.yc_deletetime = yc_deletetime;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public Circle(int yc_id, int yc_uid, String yc_text, String yc_img, Date yc_createtime, Date yc_deletetime,
			int flag) {
		super();
		this.yc_id = yc_id;
		this.yc_uid = yc_uid;
		this.yc_text = yc_text;
		this.yc_img = yc_img;
		this.yc_createtime = yc_createtime;
		this.yc_deletetime = yc_deletetime;
		this.flag = flag;
	}
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Circle [yc_id=" + yc_id + ", yc_uid=" + yc_uid + ", yc_text=" + yc_text + ", yc_img=" + yc_img
				+ ", yc_createtime=" + yc_createtime + ", yc_deletetime=" + yc_deletetime + ", flag=" + flag + "]";
	}
	
}
