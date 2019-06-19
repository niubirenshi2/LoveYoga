package org.team3.loveyoga.pojo;

import java.math.BigDecimal;

public class Wallet {
    private Integer ywId;

    private Integer ywCardid;

    private BigDecimal ywBalance;

    private Integer ywFlag;

    public Integer getYwId() {
        return ywId;
    }

    public void setYwId(Integer ywId) {
        this.ywId = ywId;
    }

    public Integer getYwCardid() {
        return ywCardid;
    }

    public void setYwCardid(Integer ywCardid) {
        this.ywCardid = ywCardid;
    }

    public BigDecimal getYwBalance() {
        return ywBalance;
    }

    public void setYwBalance(BigDecimal ywBalance) {
        this.ywBalance = ywBalance;
    }

    public Integer getYwFlag() {
        return ywFlag;
    }

    public void setYwFlag(Integer ywFlag) {
        this.ywFlag = ywFlag;
    }
}