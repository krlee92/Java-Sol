package com.lee.jun16oop.product;

public class Pen extends Product{
	
	private String color;
	
	public Pen() {
		// TODO Auto-generated constructor stub
	}

	public Pen(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(color);
	}
	
	@Override
	public void notice() {
		System.out.println("¸ÔÁö¸¶");
	}

}
