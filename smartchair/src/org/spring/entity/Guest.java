package org.spring.entity;

public class Guest {
	private int g_id;
	private int u_id;
	private int c_id;
	public Guest(int g_id, int u_id, int c_id) {
		super();
		this.g_id = g_id;
		this.u_id = u_id;
		this.c_id = c_id;
	}
	public Guest() {
		super();
	}
	public int getG_id() {
		return g_id;
	}
	public void setG_id(int g_id) {
		this.g_id = g_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	@Override
	public String toString() {
		return "Guest [g_id=" + g_id + ", u_id=" + u_id + ", c_id=" + c_id + "]";
	}
	
}
