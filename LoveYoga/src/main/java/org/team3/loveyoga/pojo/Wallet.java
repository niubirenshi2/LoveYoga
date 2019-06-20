package org.team3.loveyoga.pojo;

import java.math.BigDecimal;

public class Wallet {
    private Integer yw_id;

    private BigDecimal yw_balance;

    private Integer yw_flag;

	public Integer getYw_id() {
		return yw_id;
	}

	public void setYw_id(Integer yw_id) {
		this.yw_id = yw_id;
	}

	public BigDecimal getYw_balance() {
		return yw_balance;
	}

	public void setYw_balance(BigDecimal yw_balance) {
		this.yw_balance = yw_balance;
	}

	public Integer getYw_flag() {
		return yw_flag;
	}

	public void setYw_flag(Integer yw_flag) {
		this.yw_flag = yw_flag;
	}

	public Wallet(Integer yw_id, BigDecimal yw_balance, Integer yw_flag) {
		
		this.yw_id = yw_id;
		this.yw_balance = yw_balance;
		this.yw_flag = yw_flag;
	}

	public Wallet() {
		
	}

	@Override
	public String toString() {
		return "Wallet [yw_id=" + yw_id + ", yw_balance=" + yw_balance + ", yw_flag=" + yw_flag + "]";
	}
	
	
    
}