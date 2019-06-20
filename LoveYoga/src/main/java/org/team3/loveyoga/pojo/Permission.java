package org.team3.loveyoga.pojo;

public class Permission {
    private Integer yp_id;

	private String yp_perm;

	public Integer getYp_id() {
		return yp_id;
	}

	public void setYp_id(Integer yp_id) {
		this.yp_id = yp_id;
	}

	public String getYp_perm() {
		return yp_perm;
	}

	public void setYp_perm(String yp_perm) {
		this.yp_perm = yp_perm;
	}

	@Override
	public String toString() {
		return "Permission [yp_id=" + yp_id + ", yp_perm=" + yp_perm + "]";
	}


	
}