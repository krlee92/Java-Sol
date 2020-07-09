package com.lee.jun15oop.menu;

public class Menu {
	// 1.멤버변수 -> 묻지도 따지지도않고 private
	private String name;
	private int price;
	private boolean good;
	
	// 2. 생성자배치
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String name, int price, boolean good) {
		super();
		this.name = name;
		this.price = price;
		this.good = good;
	}
	// 3. getter, setter 배치
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

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(good);
	}
	
	

}
