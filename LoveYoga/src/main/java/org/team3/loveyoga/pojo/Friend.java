package org.team3.loveyoga.pojo;

import java.util.Date;

public class Friend {
    private Integer id;

    private Integer userID;

    private Integer friendID;

    private Integer state;

    private Integer groupState;

    private Date createTime;

    private Date delecteTime;

    private Integer flag;
    
    //邀请人姓名
    private User name;
    
    
	public User getName() {
		return name;
	}

	public void setName(User name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getFriendID() {
		return friendID;
	}

	public void setFriendID(Integer friendID) {
		this.friendID = friendID;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getGroupState() {
		return groupState;
	}

	public void setGroupState(Integer groupState) {
		this.groupState = groupState;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getDelecteTime() {
		return delecteTime;
	}

	public void setDelecteTime(Date delecteTime) {
		this.delecteTime = delecteTime;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	
}