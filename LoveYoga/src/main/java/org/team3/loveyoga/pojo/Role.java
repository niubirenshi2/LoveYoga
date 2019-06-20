package org.team3.loveyoga.pojo;

public class Role {
    private Integer yr_id;

	private String yr_role;

	public Integer getYr_id() {
		return yr_id;
	}

	public void setYr_id(Integer yr_id) {
		this.yr_id = yr_id;
	}

	public String getYr_role() {
		return yr_role;
	}

	public void setYr_role(String yr_role) {
		this.yr_role = yr_role;
	}

	@Override
	public String toString() {
		return "Role [yr_id=" + yr_id + ", yr_role=" + yr_role + "]";
	}

	
}