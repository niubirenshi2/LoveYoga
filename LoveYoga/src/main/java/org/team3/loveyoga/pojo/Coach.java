package org.team3.loveyoga.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Coach {
    private Integer id;

    private Integer uid;

    private Date authority;

    private String headImg;

    private String nickName;

    private String address;

    private BigDecimal price;

    private Integer freetime;

    private Integer acceptState;

    private String genre;

    private Integer telvisible;

    private String telphone;

    private Integer courseState;

    private Integer persoalTrainer;

    private BigDecimal expectedSalary;

    private String qq;

    private BigDecimal balance;

    private Integer flag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Date getAuthority() {
		return authority;
	}

	public void setAuthority(Date authority) {
		this.authority = authority;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getFreetime() {
		return freetime;
	}

	public void setFreetime(Integer freetime) {
		this.freetime = freetime;
	}

	public Integer getAcceptState() {
		return acceptState;
	}

	public void setAcceptState(Integer acceptState) {
		this.acceptState = acceptState;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getTelvisible() {
		return telvisible;
	}

	public void setTelvisible(Integer telvisible) {
		this.telvisible = telvisible;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public Integer getCourseState() {
		return courseState;
	}

	public void setCourseState(Integer courseState) {
		this.courseState = courseState;
	}

	public Integer getPersoalTrainer() {
		return persoalTrainer;
	}

	public void setPersoalTrainer(Integer persoalTrainer) {
		this.persoalTrainer = persoalTrainer;
	}

	public BigDecimal getExpectedSalary() {
		return expectedSalary;
	}

	public void setExpectedSalary(BigDecimal expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Coach [id=" + id + ", uid=" + uid + ", authority=" + authority + ", headImg=" + headImg + ", nickName="
				+ nickName + ", address=" + address + ", price=" + price + ", freetime=" + freetime + ", acceptState="
				+ acceptState + ", genre=" + genre + ", telvisible=" + telvisible + ", telphone=" + telphone
				+ ", courseState=" + courseState + ", persoalTrainer=" + persoalTrainer + ", expectedSalary="
				+ expectedSalary + ", qq=" + qq + ", balance=" + balance + ", flag=" + flag + "]";
	}

  
}