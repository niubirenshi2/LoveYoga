package org.team3.loveyoga.pojo;

public class RoleAccess {
    private Integer yrp_rid;

	private Integer yrp_pid;

	public Integer getYrp_rid() {
		return yrp_rid;
	}

	public void setYrp_rid(Integer yrp_rid) {
		this.yrp_rid = yrp_rid;
	}

	public Integer getYrp_pid() {
		return yrp_pid;
	}

	public void setYrp_pid(Integer yrp_pid) {
		this.yrp_pid = yrp_pid;
	}

	@Override
	public String toString() {
		return "RoleAccess [yrp_rid=" + yrp_rid + ", yrp_pid=" + yrp_pid + "]";
	}

	

}