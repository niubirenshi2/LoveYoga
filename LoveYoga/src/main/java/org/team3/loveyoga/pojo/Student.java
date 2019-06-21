package org.team3.loveyoga.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Student {
    private Integer id;

    private String qq;

    private String nickName;

    private String headImg;

    private String address;

    private BigDecimal balance;

    private Date creatTime;

    private Date updateTime;

    private Integer state;

    private Integer userID;

    private Integer flag;

    private String note;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", qq=" + qq + ", nickName=" + nickName + ", headImg=" + headImg + ", address="
				+ address + ", balance=" + balance + ", creatTime=" + creatTime + ", updateTime=" + updateTime
				+ ", state=" + state + ", userID=" + userID + ", flag=" + flag + ", note=" + note + "]";
	}

 
}