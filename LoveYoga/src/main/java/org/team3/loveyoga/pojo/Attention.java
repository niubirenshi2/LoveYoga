package org.team3.loveyoga.pojo;

import java.util.Date;
import java.util.List;

public class Attention {
	private Integer ya_id;
	private Integer ya_uid;
	private Integer ya_fid;
	private Date ya_createtime;
	private Date ya_deletetime;
	private Integer flag;
	//根据账号查出朋友圈的信息
//	private List<Circle> circles;
	
	//查询关注的用户发的朋友圈
//	public List<Circle> getCircles() {
//		return circles;
//	}
//	public void setCircles(List<Circle> circles) {
//		this.circles = circles;
//	}
	
	
	public Integer getYa_id() {
		return ya_id;
	}
	public void setYa_id(Integer ya_id) {
		this.ya_id = ya_id;
	}
	public Integer getYa_uid() {
		return ya_uid;
	}
	public void setYa_uid(Integer ya_uid) {
		this.ya_uid = ya_uid;
	}
	public Integer getYa_fid() {
		return ya_fid;
	}
	public void setYa_fid(Integer ya_fid) {
		this.ya_fid = ya_fid;
	}
	public Date getYa_createtime() {
		return ya_createtime;
	}
	public void setYa_createtime(Date ya_createtime) {
		this.ya_createtime = ya_createtime;
	}
	public Date getYa_deletetime() {
		return ya_deletetime;
	}
	public void setYa_deletetime(Date ya_deletetime) {
		this.ya_deletetime = ya_deletetime;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	
	
	
	
	
}
