package org.team3.loveyoga.pojo;

public class Gym_photo {
	private Integer	ygp_id;
	private	String	ygp_img;
	private	Integer	ygp_ygid;
	public Integer getYgp_id() {
		return ygp_id;
	}
	public void setYgp_id(Integer ygp_id) {
		this.ygp_id = ygp_id;
	}
	public String getYgp_img() {
		return ygp_img;
	}
	public void setYgp_img(String ygp_img) {
		this.ygp_img = ygp_img;
	}
	public Integer getYgp_ygid() {
		return ygp_ygid;
	}
	public void setYgp_ygid(Integer ygp_ygid) {
		this.ygp_ygid = ygp_ygid;
	}
	@Override
	public String toString() {
		return "Gym_photo [ygp_id=" + ygp_id + ", ygp_img=" + ygp_img
				+ ", ygp_ygid=" + ygp_ygid + "]";
	}
	public Gym_photo(Integer ygp_id, String ygp_img, Integer ygp_ygid) {
		super();
		this.ygp_id = ygp_id;
		this.ygp_img = ygp_img;
		this.ygp_ygid = ygp_ygid;
	}
	public Gym_photo() {
		super();
	}
	
}
