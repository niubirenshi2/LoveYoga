package org.team3.loveyoga.pojo;

public class HeadImg {
    private Integer headImgId;

    private String headImg;

    private Long flag;

	public Integer getHeadImgId() {
		return headImgId;
	}

	public void setHeadImgId(Integer headImgId) {
		this.headImgId = headImgId;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public Long getFlag() {
		return flag;
	}

	public void setFlag(Long flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "HeadImg [headImgId=" + headImgId + ", headImg=" + headImg + ", flag=" + flag + "]";
	}

}