package org.team3.loveyoga.pojo;

public class Nickname {
    private Integer yn_nicknameid;

	private String yn_nickname;

	private Integer yn_flag;

	public Integer getYn_nicknameid() {
		return yn_nicknameid;
	}

	public void setYn_nicknameid(Integer yn_nicknameid) {
		this.yn_nicknameid = yn_nicknameid;
	}

	public String getYn_nickname() {
		return yn_nickname;
	}

	public void setYn_nickname(String yn_nickname) {
		this.yn_nickname = yn_nickname;
	}

	public Integer getYn_flag() {
		return yn_flag;
	}

	public void setYn_flag(Integer yn_flag) {
		this.yn_flag = yn_flag;
	}

	@Override
	public String toString() {
		return "Nickname [yn_nicknameid=" + yn_nicknameid + ", yn_nickname=" + yn_nickname + ", yn_flag=" + yn_flag
				+ "]";
	}

	

	

}