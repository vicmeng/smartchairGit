package org.spring.entity;

public class Chair {
	private int c_id;
	private String c_mac;
	private String c_number;
	private String c_tele;
	private String c_produce;
	private String c_state;
	public Chair(int c_id, String c_mac, String c_number, String c_tele, String c_produce, String c_state) {
		super();
		this.c_id = c_id;
		this.c_mac = c_mac;
		this.c_number = c_number;
		this.c_tele = c_tele;
		this.c_produce = c_produce;
		this.c_state = c_state;
	}
	public Chair() {
		super();
		
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_mac() {
		return c_mac;
	}
	public void setC_mac(String c_mac) {
		this.c_mac = c_mac;
	}
	public String getC_number() {
		return c_number;
	}
	public void setC_number(String c_number) {
		this.c_number = c_number;
	}
	public String getC_tele() {
		return c_tele;
	}
	public void setC_tele(String c_tele) {
		this.c_tele = c_tele;
	}
	public String getC_produce() {
		return c_produce;
	}
	public void setC_produce(String c_produce) {
		this.c_produce = c_produce;
	}
	public String getC_state() {
		return c_state;
	}
	public void setC_state(String c_state) {
		this.c_state = c_state;
	}
	@Override
	public String toString() {
		return "Chair [c_id=" + c_id + ", c_mac=" + c_mac + ", c_number=" + c_number + ", c_tele=" + c_tele
				+ ", c_produce=" + c_produce + ", c_state=" + c_state + "]";
	}
	
}
