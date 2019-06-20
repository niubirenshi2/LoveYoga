package org.team3.loveyoga.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Consume_Log {
	private int ycl_id;
	private int ycl_sid;
	private BigDecimal ycl_chargemoney;
	private Date ycl_createtime;
	private String ycl_tradenumber;
	public int getYcl_id() {
		return ycl_id;
	}
	public void setYcl_id(int ycl_id) {
		this.ycl_id = ycl_id;
	}
	public int getYcl_sid() {
		return ycl_sid;
	}
	public void setYcl_sid(int ycl_sid) {
		this.ycl_sid = ycl_sid;
	}
	public BigDecimal getYcl_chargemoney() {
		return ycl_chargemoney;
	}
	public void setYcl_chargemoney(BigDecimal ycl_chargemoney) {
		this.ycl_chargemoney = ycl_chargemoney;
	}
	public Date getYcl_createtime() {
		return ycl_createtime;
	}
	public void setYcl_createtime(Date ycl_createtime) {
		this.ycl_createtime = ycl_createtime;
	}
	public String getYcl_tradenumber() {
		return ycl_tradenumber;
	}
	public void setYcl_tradenumber(String ycl_tradenumber) {
		this.ycl_tradenumber = ycl_tradenumber;
	}
	@Override
	public String toString() {
		return "Y_Consume_Log [ycl_id=" + ycl_id + ", ycl_sid=" + ycl_sid + ", ycl_chargemoney=" + ycl_chargemoney
				+ ", ycl_createtime=" + ycl_createtime + ", ycl_tradenumber=" + ycl_tradenumber + "]";
	}
	public Consume_Log(int ycl_id, int ycl_sid, BigDecimal ycl_chargemoney, Date ycl_createtime,
			String ycl_tradenumber) {
		super();
		this.ycl_id = ycl_id;
		this.ycl_sid = ycl_sid;
		this.ycl_chargemoney = ycl_chargemoney;
		this.ycl_createtime = ycl_createtime;
		this.ycl_tradenumber = ycl_tradenumber;
	}
	public Consume_Log() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
