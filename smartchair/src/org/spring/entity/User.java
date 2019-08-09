package org.spring.entity;

public class User {
	private int u_id;
	private String u_username;
	private String u_password;
	private String u_name;
	private String u_queue;
	private String u_number;
	public User(int u_id, String u_username, String u_password, String u_name, String u_queue, String u_number) {
		super();
		this.u_id = u_id;
		this.u_username = u_username;
		this.u_password = u_password;
		this.u_name = u_name;
		this.u_queue = u_queue;
		this.u_number = u_number;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_username() {
		return u_username;
	}
	public void setU_username(String u_username) {
		this.u_username = u_username;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_queue() {
		return u_queue;
	}
	public void setU_queue(String u_queue) {
		this.u_queue = u_queue;
	}
	public String getU_number() {
		return u_number;
	}
	public void setU_number(String u_number) {
		this.u_number = u_number;
	}
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_username=" + u_username + ", u_password=" + u_password + ", u_name=" + u_name
				+ ", u_queue=" + u_queue + ", u_number=" + u_number + "]";
	}
	
}
