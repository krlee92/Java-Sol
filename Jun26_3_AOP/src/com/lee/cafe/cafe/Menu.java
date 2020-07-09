package com.lee.cafe.cafe;

public class Menu {
	private int no;
	private String name;
	private int price;
	private String bean;
	private int where;
	
	public Menu(int no, String name, int price, String bean, int where) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.bean = bean;
		this.where = where;
	}
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBean() {
		return bean;
	}

	public void setBean(String bean) {
		this.bean = bean;
	}

	public int getWhere() {
		return where;
	}

	public void setWhere(int where) {
		this.where = where;
	}
	
	

}
