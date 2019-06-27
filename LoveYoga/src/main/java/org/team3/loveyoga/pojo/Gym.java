package org.team3.loveyoga.pojo;

import java.math.BigDecimal;

public class Gym {
    private Integer id;

    private String gymName;

    private String telphone;

    private String qq;

    private String img;

    private String address;

    private Integer uid;

    private String plan;

    private BigDecimal balance;

    private String account;

    private Integer state;

    private Integer flag;

    private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGymName() {
		return gymName;
	}

	public void setGymName(String gymName) {
		this.gymName = gymName;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Gym [id=" + id + ", gymName=" + gymName + ", telphone=" + telphone + ", qq=" + qq + ", img=" + img
				+ ", address=" + address + ", uid=" + uid + ", plan=" + plan + ", balance=" + balance + ", account="
				+ account + ", state=" + state + ", flag=" + flag + ", description=" + description + "]";
	}
    

 
}

