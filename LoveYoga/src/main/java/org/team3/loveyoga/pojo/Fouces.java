package org.team3.loveyoga.pojo;

import java.util.Date;

public class Fouces {
    private Integer id;

    private Integer userid;

    private Integer foucesid;

    private Date createtime;

    private Date deletetime;

    private Integer flag;
    
    private Integer state;

    public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFoucesid() {
        return foucesid;
    }

    public void setFoucesid(Integer foucesid) {
        this.foucesid = foucesid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}