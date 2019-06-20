package org.team3.loveyoga.pojo;

public class HeadImg {
    private Integer yh_headimgid;

	private String yh_headimg;

	private Integer yh_flag;

	public Integer getYh_headimgid() {
		return yh_headimgid;
	}

	public void setYh_headimgid(Integer yh_headimgid) {
		this.yh_headimgid = yh_headimgid;
	}

	public String getYh_headimg() {
		return yh_headimg;
	}

	public void setYh_headimg(String yh_headimg) {
		this.yh_headimg = yh_headimg;
	}

	public Integer getYh_flag() {
		return yh_flag;
	}

	public void setYh_flag(Integer yh_flag) {
		this.yh_flag = yh_flag;
	}

	@Override
	public String toString() {
		return "HeadImg [yh_headimgid=" + yh_headimgid + ", yh_headimg=" + yh_headimg + ", yh_flag=" + yh_flag + "]";
	}

	
}