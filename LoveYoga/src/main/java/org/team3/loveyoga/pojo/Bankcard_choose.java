package org.team3.loveyoga.pojo;

import java.math.BigDecimal;

public class Bankcard_choose {
    private Integer ybcId;

    private Integer ybcYuid;

    private String ybcCardnumber;

    private BigDecimal ybcBalance;

    private Integer ybcFlag;

    public Integer getYbcId() {
        return ybcId;
    }

    public void setYbcId(Integer ybcId) {
        this.ybcId = ybcId;
    }

    public Integer getYbcYuid() {
        return ybcYuid;
    }

    public void setYbcYuid(Integer ybcYuid) {
        this.ybcYuid = ybcYuid;
    }

    public String getYbcCardnumber() {
        return ybcCardnumber;
    }

    public void setYbcCardnumber(String ybcCardnumber) {
        this.ybcCardnumber = ybcCardnumber;
    }

    public BigDecimal getYbcBalance() {
        return ybcBalance;
    }

    public void setYbcBalance(BigDecimal ybcBalance) {
        this.ybcBalance = ybcBalance;
    }

    public Integer getYbcFlag() {
        return ybcFlag;
    }

    public void setYbcFlag(Integer ybcFlag) {
        this.ybcFlag = ybcFlag;
    }
}