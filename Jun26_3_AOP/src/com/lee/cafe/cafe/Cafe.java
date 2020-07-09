package com.lee.cafe.cafe;

// DTO/JavaBean

public class Cafe {
	private int no;
	private String name;
	private String where;
	
	public Cafe() {
		// TODO Auto-generated constructor stub
	}

	public Cafe(int no, String name, String where) {
		super();
		this.no = no;
		this.name = name;
		this.where = where;
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

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}
	
	
}

