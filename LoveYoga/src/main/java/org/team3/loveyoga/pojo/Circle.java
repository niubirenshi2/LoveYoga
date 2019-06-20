package org.team3.loveyoga.pojo;

import java.util.Date;

public class Circle {
	
	private Integer yc_id;
	private Integer yc_uid;
	private String yc_text;
	private String yc_img;
	private Date yc_createtime;
	private Date yc_deletetime;
	private int flag;
	
	public Integer getYc_id() {
		return yc_id;
	}
	public void setYc_id(Integer yc_id) {
		this.yc_id = yc_id;
	}
	public Integer getYc_uid() {
		return yc_uid;
	}
	public void setYc_uid(Integer yc_uid) {
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
	
	@Override
	public String toString() {
		return "Circle [yc_id=" + yc_id + ", yc_uid=" + yc_uid + ", yc_text=" + yc_text + ", yc_img=" + yc_img
				+ ", yc_createtime=" + yc_createtime + ", yc_deletetime=" + yc_deletetime + ", flag=" + flag + "]";
	}
	
	
}
