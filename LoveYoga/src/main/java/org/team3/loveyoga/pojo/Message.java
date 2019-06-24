package org.team3.loveyoga.pojo;

import java.util.Date;

public class Message {
    private Integer id;

    private Integer studentID;

    private Integer coachID;
    
    private Integer gymID;

    private String form;

    private Date createTime;

    private Integer flag;
    
    private Integer state;

    private String message;

    
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


    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public Integer getGymID() {
		return gymID;
	}

	public void setGymID(Integer gymID) {
		this.gymID = gymID;
	}

	public Integer getCoachID() {
		return coachID;
	}

	public void setCoachID(Integer coachID) {
		this.coachID = coachID;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
}