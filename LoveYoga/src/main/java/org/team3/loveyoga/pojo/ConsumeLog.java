package org.team3.loveyoga.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ConsumeLog {
    private Integer id;

    private Integer studentid;

    private BigDecimal chargemoney;

    private Date creattime;

    private String tradenumber;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public BigDecimal getChargemoney() {
        return chargemoney;
    }

    public void setChargemoney(BigDecimal chargemoney) {
        this.chargemoney = chargemoney;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getTradenumber() {
        return tradenumber;
    }

    public void setTradenumber(String tradenumber) {
        this.tradenumber = tradenumber;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}