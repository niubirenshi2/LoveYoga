package org.team3.loveyoga.pojo;

import java.util.Date;

public class Attention {
	private int ya_id;
	private int ya_uid;
	private int ya_fid;
	private Date ya_createtime;
	private Date deletetime;
	private int flag;
	public int getYa_id() {
		return ya_id;
	}
	public void setYa_id(int ya_id) {
		this.ya_id = ya_id;
	}
	public int getYa_uid() {
		return ya_uid;
	}
	public void setYa_uid(int ya_uid) {
		this.ya_uid = ya_uid;
	}
	public int getYa_fid() {
		return ya_fid;
	}
	public void setYa_fid(int ya_fid) {
		this.ya_fid = ya_fid;
	}
	public Date getYa_createtime() {
		return ya_createtime;
	}
	public void setYa_createtime(Date ya_createtime) {
		this.ya_createtime = ya_createtime;
	}
	public Date getDeletetime() {
		return deletetime;
	}
	public void setDeletetime(Date deletetime) {
		this.deletetime = deletetime;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public Attention(int ya_id, int ya_uid, int ya_fid, Date ya_createtime, Date deletetime, int flag) {
		super();
		this.ya_id = ya_id;
		this.ya_uid = ya_uid;
		this.ya_fid = ya_fid;
		this.ya_createtime = ya_createtime;
		this.deletetime = deletetime;
		this.flag = flag;
	}
	public Attention() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Y_Attention [ya_id=" + ya_id + ", ya_uid=" + ya_uid + ", ya_fid=" + ya_fid + ", ya_createtime="
				+ ya_createtime + ", deletetime=" + deletetime + ", flag=" + flag + "]";
	}
	
	
}
