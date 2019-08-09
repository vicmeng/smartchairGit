package org.spring.entity;

import java.util.Date;

public class Time {
	private int t_id;
	private int f_state;
	private String f_food;
	private String f_money;
	private Date f_date;
	private int f_id;
	public Time(int t_id, int f_state, String f_food, String f_money, Date f_date, int f_id) {
		super();
		this.t_id = t_id;
		this.f_state = f_state;
		this.f_food = f_food;
		this.f_money = f_money;
		this.f_date = f_date;
		this.f_id = f_id;
	}
	public Time() {
		super();
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public int getF_state() {
		return f_state;
	}
	public void setF_state(int f_state) {
		this.f_state = f_state;
	}
	public String getF_food() {
		return f_food;
	}
	public void setF_food(String f_food) {
		this.f_food = f_food;
	}
	public String getF_money() {
		return f_money;
	}
	public void setF_money(String f_money) {
		this.f_money = f_money;
	}
	public Date getF_date() {
		return f_date;
	}
	public void setF_date(Date f_date) {
		this.f_date = f_date;
	}
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	@Override
	public String toString() {
		return "Time [t_id=" + t_id + ", f_state=" + f_state + ", f_food=" + f_food + ", f_money=" + f_money
				+ ", f_date=" + f_date + ", f_id=" + f_id + "]";
	}
	
	
}
