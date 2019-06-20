package org.team3.loveyoga.pojo;

public class UserRole {
    private Integer yur_uid;

	private Integer yur_rid;

	public Integer getYur_uid() {
		return yur_uid;
	}

	public void setYur_uid(Integer yur_uid) {
		this.yur_uid = yur_uid;
	}

	public Integer getYur_rid() {
		return yur_rid;
	}

	public void setYur_rid(Integer yur_rid) {
		this.yur_rid = yur_rid;
	}

	@Override
	public String toString() {
		return "UserRole [yur_uid=" + yur_uid + ", yur_rid=" + yur_rid + "]";
	}


	
}