package org.spring.entity;

public class Restaurant {
	private int r_id;
	private String r_name;
	private String r_position;
	private String r_tele;
	private String r_picture;
	public Restaurant(int r_id, String r_name, String r_position, String r_tele, String r_picture) {
		super();
		this.r_id = r_id;
		this.r_name = r_name;
		this.r_position = r_position;
		this.r_tele = r_tele;
		this.r_picture = r_picture;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_position() {
		return r_position;
	}
	public void setR_position(String r_position) {
		this.r_position = r_position;
	}
	public String getR_tele() {
		return r_tele;
	}
	public void setR_tele(String r_tele) {
		this.r_tele = r_tele;
	}
	public String getR_picture() {
		return r_picture;
	}
	public void setR_picture(String r_picture) {
		this.r_picture = r_picture;
	}
	@Override
	public String toString() {
		return "Restaurant [r_id=" + r_id + ", r_name=" + r_name + ", r_position=" + r_position + ", r_tele=" + r_tele
				+ ", r_picture=" + r_picture + "]";
	}
	
}
