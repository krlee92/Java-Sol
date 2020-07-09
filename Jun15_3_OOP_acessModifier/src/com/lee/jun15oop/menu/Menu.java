package com.lee.jun15oop.menu;

public class Menu {
	// 1.������� -> ������ ���������ʰ� private
	private String name;
	private int price;
	private boolean good;
	
	// 2. �����ڹ�ġ
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String name, int price, boolean good) {
		super();
		this.name = name;
		this.price = price;
		this.good = good;
	}
	// 3. getter, setter ��ġ
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
