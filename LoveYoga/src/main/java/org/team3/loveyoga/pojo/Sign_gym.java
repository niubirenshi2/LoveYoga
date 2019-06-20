package org.team3.loveyoga.pojo;

public class Sign_gym {
    private Integer ysg_id;

    private Integer ysg_cid;

    private Integer ysg_flag;

	public Integer getYsg_id() {
		return ysg_id;
	}

	public void setYsg_id(Integer ysg_id) {
		this.ysg_id = ysg_id;
	}

	public Integer getYsg_cid() {
		return ysg_cid;
	}

	public void setYsg_cid(Integer ysg_cid) {
		this.ysg_cid = ysg_cid;
	}

	public Integer getYsg_flag() {
		return ysg_flag;
	}

	public void setYsg_flag(Integer ysg_flag) {
		this.ysg_flag = ysg_flag;
	}

	public Sign_gym(Integer ysg_id, Integer ysg_cid, Integer ysg_flag) {

		this.ysg_id = ysg_id;
		this.ysg_cid = ysg_cid;
		this.ysg_flag = ysg_flag;
	}

	public Sign_gym() {
		
	}

	@Override
	public String toString() {
		return "Sign_gym [ysg_id=" + ysg_id + ", ysg_cid=" + ysg_cid + ", ysg_flag=" + ysg_flag + "]";
	}
	
	
	
    
}