package org.team3.loveyoga.pojo;

import java.util.Date;

public class Withdrawmoney {
    private Integer ycl_id;

    private Integer ycl_sid;

    private Long ycl_chargemoney;

    private Date ycl_createtime;
    
    private String cardnumber;

    private String ycl_tradenumber;
    
    private int flag;

	public Integer getYcl_id() {
		return ycl_id;
	}

	public void setYcl_id(Integer ycl_id) {
		this.ycl_id = ycl_id;
	}

	public Integer getYcl_sid() {
		return ycl_sid;
	}

	public void setYcl_sid(Integer ycl_sid) {
		this.ycl_sid = ycl_sid;
	}

	public Long getYcl_chargemoney() {
		return ycl_chargemoney;
	}

	public void setYcl_chargemoney(Long ycl_chargemoney) {
		this.ycl_chargemoney = ycl_chargemoney;
	}

	public Date getYcl_createtime() {
		return ycl_createtime;
	}

	public void setYcl_createtime(Date ycl_createtime) {
		this.ycl_createtime = ycl_createtime;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getYcl_tradenumber() {
		return ycl_tradenumber;
	}

	public void setYcl_tradenumber(String ycl_tradenumber) {
		this.ycl_tradenumber = ycl_tradenumber;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Consume_log [ycl_id=" + ycl_id + ", ycl_sid=" + ycl_sid + ", ycl_chargemoney=" + ycl_chargemoney
				+ ", ycl_createtime=" + ycl_createtime + ", cardnumber=" + cardnumber + ", ycl_tradenumber="
				+ ycl_tradenumber + ", flag=" + flag + "]";
	}

	public Withdrawmoney(Integer ycl_id, Integer ycl_sid, Long ycl_chargemoney, Date ycl_createtime, String cardnumber,
			String ycl_tradenumber, int flag) {
		
		this.ycl_id = ycl_id;
		this.ycl_sid = ycl_sid;
		this.ycl_chargemoney = ycl_chargemoney;
		this.ycl_createtime = ycl_createtime;
		this.cardnumber = cardnumber;
		this.ycl_tradenumber = ycl_tradenumber;
		this.flag = flag;
	}

	public Withdrawmoney() {
	
	}

    
}