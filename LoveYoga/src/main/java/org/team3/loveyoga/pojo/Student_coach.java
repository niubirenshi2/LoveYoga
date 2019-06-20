package org.team3.loveyoga.pojo;

import java.util.List;

public class Student_coach {
	private List<Student> uid;
	private Integer cid;
	
	public List<Student> getUid() {
		return uid;
	}
	public void setUid(List<Student> uid) {
		this.uid = uid;
	}
	public Integer getCid() {
		return cid;
	}
	
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
	public Student_coach(List<Student> uid, Integer cid) {
		this.uid = uid;
		this.cid = cid;
	}
	public Student_coach() {
		
	}
	
	@Override
	public String toString() {
		return "Student_coach [uid=" + uid + ", cid=" + cid + "]";
	}
}
