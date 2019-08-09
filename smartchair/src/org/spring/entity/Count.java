package org.spring.entity;

public class Count {
	private int c_state;
	private int c_count;
	public Count(int c_state, int c_count) {
		super();
		this.c_state = c_state;
		this.c_count = c_count;
	}
	public Count() {
		super();
		
	}
	public int getC_state() {
		return c_state;
	}
	public void setC_state(int c_state) {
		this.c_state = c_state;
	}
	public int getC_count() {
		return c_count;
	}
	public void setC_count(int c_count) {
		this.c_count = c_count;
	}
	@Override
	public String toString() {
		return "Count [c_state=" + c_state + ", c_count=" + c_count + "]";
	}
	
	
}
