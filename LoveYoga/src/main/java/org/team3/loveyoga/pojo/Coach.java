package org.team3.loveyoga.pojo;

import java.math.BigDecimal;

public class Coach {
    private Integer id;

    private Integer uid;

    private String authority;

    private String headImg;

    private String nickName;


    private BigDecimal price;

    private String freetime;

    private String acceptState;

    private String genre;

    private String telvisible;

    private String telphone;

    private String courseState;

    private String persoalTrainer;

    private BigDecimal expectedSalary;

    private String qq;

    private BigDecimal balance;
    
    private double lng;
    
    private double lat;

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

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getFreetime() {
		return freetime;
	}

	public void setFreetime(String freetime) {
		this.freetime = freetime;
	}

	public String getAcceptState() {
		return acceptState;
	}

	public void setAcceptState(String acceptState) {
		this.acceptState = acceptState;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTelvisible() {
		return telvisible;
	}

	public void setTelvisible(String telvisible) {
		this.telvisible = telvisible;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getCourseState() {
		return courseState;
	}

	public void setCourseState(String courseState) {
		this.courseState = courseState;
	}

	public String getPersoalTrainer() {
		return persoalTrainer;
	}

	public void setPersoalTrainer(String persoalTrainer) {
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

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
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
				+ nickName + ", price=" + price + ", freetime=" + freetime + ", acceptState=" + acceptState + ", genre="
				+ genre + ", telvisible=" + telvisible + ", telphone=" + telphone + ", courseState=" + courseState
				+ ", persoalTrainer=" + persoalTrainer + ", expectedSalary=" + expectedSalary + ", qq=" + qq
				+ ", balance=" + balance + ", lng=" + lng + ", lat=" + lat + ", flag=" + flag + "]";
	}

}