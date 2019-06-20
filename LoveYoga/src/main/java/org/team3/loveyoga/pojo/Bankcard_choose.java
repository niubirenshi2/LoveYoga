package org.team3.loveyoga.pojo;

import java.math.BigDecimal;

public class Bankcard_choose {
    private Integer ybc_id;

    private Integer ybc_yuid;

    private String ybc_cardnumber;

    private BigDecimal ybc_balance;

    private Integer ybc_flag;

	public Integer getYbc_id() {
		return ybc_id;
	}

	public void setYbc_id(Integer ybc_id) {
		this.ybc_id = ybc_id;
	}

	public Integer getYbc_yuid() {
		return ybc_yuid;
	}

	public void setYbc_yuid(Integer ybc_yuid) {
		this.ybc_yuid = ybc_yuid;
	}

	public String getYbc_cardnumber() {
		return ybc_cardnumber;
	}

	public void setYbc_cardnumber(String ybc_cardnumber) {
		this.ybc_cardnumber = ybc_cardnumber;
	}

	public BigDecimal getYbc_balance() {
		return ybc_balance;
	}

	public void setYbc_balance(BigDecimal ybc_balance) {
		this.ybc_balance = ybc_balance;
	}

	public Integer getYbc_flag() {
		return ybc_flag;
	}

	public void setYbc_flag(Integer ybc_flag) {
		this.ybc_flag = ybc_flag;
	}

	public Bankcard_choose(Integer ybc_id, Integer ybc_yuid, String ybc_cardnumber, BigDecimal ybc_balance,
			Integer ybc_flag) {
		
		this.ybc_id = ybc_id;
		this.ybc_yuid = ybc_yuid;
		this.ybc_cardnumber = ybc_cardnumber;
		this.ybc_balance = ybc_balance;
		this.ybc_flag = ybc_flag;
	}

	public Bankcard_choose() {
		
	}

	@Override
	public String toString() {
		return "Bankcard_choose [ybc_id=" + ybc_id + ", ybc_yuid=" + ybc_yuid + ", ybc_cardnumber=" + ybc_cardnumber
				+ ", ybc_balance=" + ybc_balance + ", ybc_flag=" + ybc_flag + "]";
	}
	
	
    
}