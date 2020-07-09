package com.lee.jun16oop.product;

public abstract class Product { //상품이란 객체를 만들진 않기때문에 추상메소드
	
	private String name;
	private int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
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
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
	
	public abstract void notice(); //하위클래스에서 반드시 구현해야하는
//									추상 메소드, 공통으로 들어가는게 아니라서.
		
	
		
	
}
