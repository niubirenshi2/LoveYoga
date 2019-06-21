package org.team3.loveyoga.pojo;

import java.util.Date;

public class Friend {
    private Integer id;

    private Integer userid;

    private Integer friendid;

    private Integer state;

    private Integer groupstate;

    private Date createtime;

    private Date delectetime;

    private Integer flag;

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

    public Integer getFriendid() {
        return friendid;
    }

    public void setFriendid(Integer friendid) {
        this.friendid = friendid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getGroupstate() {
        return groupstate;
    }

    public void setGroupstate(Integer groupstate) {
        this.groupstate = groupstate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getDelectetime() {
        return delectetime;
    }

    public void setDelectetime(Date delectetime) {
        this.delectetime = delectetime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}