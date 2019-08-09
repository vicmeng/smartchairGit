package org.spring.entity;

public class Menu {
	private int m_id;
	private String m_name;
	private String m_price;
	private String m_introduce;
	private String m_picture;
	private int m_exit;
	public Menu(int m_id, String m_name, String m_price, String m_introduce, String m_picture, int m_exit) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.m_price = m_price;
		this.m_introduce = m_introduce;
		this.m_picture = m_picture;
		this.m_exit = m_exit;
	}
	public Menu( String m_name, String m_price, String m_introduce, String m_picture, int m_exit) {
		super();
		
		this.m_name = m_name;
		this.m_price = m_price;
		this.m_introduce = m_introduce;
		this.m_picture = m_picture;
		this.m_exit = m_exit;
	}
	public Menu() {
		
	
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_price() {
		return m_price;
	}
	public void setM_price(String m_price) {
		this.m_price = m_price;
	}
	public String getM_introduce() {
		return m_introduce;
	}
	public void setM_introduce(String m_introduce) {
		this.m_introduce = m_introduce;
	}
	public String getM_picture() {
		return m_picture;
	}
	public void setM_picture(String m_picture) {
		this.m_picture = m_picture;
	}
	public int getM_exit() {
		return m_exit;
	}
	public void setM_exit(int m_exit) {
		this.m_exit = m_exit;
	}
	@Override
	public String toString() {
		return "Menu [m_id=" + m_id + ", m_name=" + m_name + ", m_price=" + m_price + ", m_introduce=" + m_introduce
				+ ", m_picture=" + m_picture + ", m_exit=" + m_exit + "]";
	}
	
}
