package org.spring.entity;

import java.util.List;

public class Form {
	private int f_id;
	private Guest guest;
	private int r_id;
	private List<Time> times;
	public Form() {
		super();
		
	}
	
	public Form(int f_id, Guest guest, int r_id, List<Time> times) {
		super();
		this.f_id = f_id;
		this.guest = guest;
		this.r_id = r_id;
		this.times = times;
	}

	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public Guest getGuest() {
		return guest;
	}
	public void setGuest(Guest guest) {
		this.guest = guest;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public List<Time> getTimes() {
		return times;
	}
	public void setTimes(List<Time> times) {
		this.times = times;
	}
	@Override
	public String toString() {
		return "Form [f_id=" + f_id + ", guest=" + guest + ", r_id=" + r_id + ", times=" + times + "]";
	}
	
	
	
	
	
}
