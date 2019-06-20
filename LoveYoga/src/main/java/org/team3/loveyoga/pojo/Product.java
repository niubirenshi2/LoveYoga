package org.team3.loveyoga.pojo;

import java.math.BigDecimal;

public class Product {
	private Integer	yp_id;
	private String yp_name;
	private	BigDecimal	yp_price;
	private	Integer yp_flag;
	private	Integer	ygid;
	public Integer getYp_id() {
		return yp_id;
	}
	public void setYp_id(Integer yp_id) {
		this.yp_id = yp_id;
	}
	public String getYp_name() {
		return yp_name;
	}
	public void setYp_name(String yp_name) {
		this.yp_name = yp_name;
	}
	public BigDecimal getYp_price() {
		return yp_price;
	}
	public void setYp_price(BigDecimal yp_price) {
		this.yp_price = yp_price;
	}
	public Integer getYp_flag() {
		return yp_flag;
	}
	public void setYp_flag(Integer yp_flag) {
		this.yp_flag = yp_flag;
	}
	public Integer getYgid() {
		return ygid;
	}
	public void setYgid(Integer ygid) {
		this.ygid = ygid;
	}
	@Override
	public String toString() {
		return "Product [yp_id=" + yp_id + ", yp_name=" + yp_name
				+ ", yp_price=" + yp_price + ", yp_flag=" + yp_flag + ", ygid="
				+ ygid + "]";
	}
	public Product(Integer yp_id, String yp_name, BigDecimal yp_price,
			Integer yp_flag, Integer ygid) {
		super();
		this.yp_id = yp_id;
		this.yp_name = yp_name;
		this.yp_price = yp_price;
		this.yp_flag = yp_flag;
		this.ygid = ygid;
	}
	public Product() {
		super();
	}
	
}
