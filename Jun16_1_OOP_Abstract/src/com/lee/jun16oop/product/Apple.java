package com.lee.jun16oop.product;

public class Apple extends Product{
	private int weight;
	
	public Apple() {
		// TODO Auto-generated constructor stub
	}
	
	public Apple(String name, int price, int weight) {
		super(name, price);
		this.weight = weight;
	}
	
	

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void notice() {
		System.out.println("¾Ä¾îµå¼î");
		
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(weight);
	}
	
	
		
	
	

}
