package org.team3.loveyoga.pojo;

import java.util.Date;

public class Order {
	private Integer yo_id;

    private Integer yo_sid;

    private Integer yo_cid;

    private Date yo_requesttime;

    private String yo_ordernumber;
    
    private String yo_paynumber;

    private Date yo_createtime;

    private Integer yo_state;

    private Date yo_paytime;

    private String yo_comment;
    
    private Student student;

    //加上一个学生的信息
    public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
    
	
	public Integer getYo_id() {
		return yo_id;
	}


	public void setYo_id(Integer yo_id) {
		this.yo_id = yo_id;
	}

	public Integer getYo_sid() {
		return yo_sid;
	}

	public void setYo_sid(Integer yo_sid) {
		this.yo_sid = yo_sid;
	}

	public Integer getYo_cid() {
		return yo_cid;
	}

	public void setYo_cid(Integer yo_cid) {
		this.yo_cid = yo_cid;
	}

	public Date getYo_requesttime() {
		return yo_requesttime;
	}

	public void setYo_requesttime(Date yo_requesttime) {
		this.yo_requesttime = yo_requesttime;
	}

	public String getYo_ordernumber() {
		return yo_ordernumber;
	}

	public void setYo_ordernumber(String yo_ordernumber) {
		this.yo_ordernumber = yo_ordernumber;
	}

	public String getYo_paynumber() {
		return yo_paynumber;
	}

	public void setYo_paynumber(String yo_paynumber) {
		this.yo_paynumber = yo_paynumber;
	}

	public Date getYo_createtime() {
		return yo_createtime;
	}

	public void setYo_createtime(Date yo_createtime) {
		this.yo_createtime = yo_createtime;
	}

	public Integer getYo_state() {
		return yo_state;
	}

	public void setYo_state(Integer yo_state) {
		this.yo_state = yo_state;
	}

	public Date getYo_paytime() {
		return yo_paytime;
	}

	public void setYo_paytime(Date yo_paytime) {
		this.yo_paytime = yo_paytime;
	}

	public String getYo_comment() {
		return yo_comment;
	}

	public void setYo_comment(String yo_comment) {
		this.yo_comment = yo_comment;
	}

	

	
	

	
    
    

}
