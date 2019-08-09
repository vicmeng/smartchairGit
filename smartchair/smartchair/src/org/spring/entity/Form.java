package org.spring.entity;

public class Form {
	private int f_id;
	private int u_id;
	private int c_id;
	private int r_id;
	private String f_state;
	private String f_food;
	private String f_money;
	private String f_date;
	private Form form;
	private User user;
	private Chair chair;
	private Restaurant restaurant;
	public Form(int f_id, int u_id, int c_id, int r_id, String f_state, String f_food, String f_money, String f_date,
			Form form, User user, Chair chair, Restaurant restaurant) {
		super();
		this.f_id = f_id;
		this.u_id = u_id;
		this.c_id = c_id;
		this.r_id = r_id;
		this.f_state = f_state;
		this.f_food = f_food;
		this.f_money = f_money;
		this.f_date = f_date;
		this.form = form;
		this.user = user;
		this.chair = chair;
		this.restaurant = restaurant;
	}
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
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
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getF_state() {
		return f_state;
	}
	public void setF_state(String f_state) {
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
	public String getF_date() {
		return f_date;
	}
	public void setF_date(String f_date) {
		this.f_date = f_date;
	}
	public Form getForm() {
		return form;
	}
	public void setForm(Form form) {
		this.form = form;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Chair getChair() {
		return chair;
	}
	public void setChair(Chair chair) {
		this.chair = chair;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	@Override
	public String toString() {
		return "Form [f_id=" + f_id + ", u_id=" + u_id + ", c_id=" + c_id + ", r_id=" + r_id + ", f_state=" + f_state
				+ ", f_food=" + f_food + ", f_money=" + f_money + ", f_date=" + f_date + ", form=" + form + ", user="
				+ user + ", chair=" + chair + ", restaurant=" + restaurant + "]";
	}
	
	
}
