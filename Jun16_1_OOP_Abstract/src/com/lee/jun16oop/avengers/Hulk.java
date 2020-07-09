package com.lee.jun16oop.avengers;

public class Hulk extends Avengers{
	private int pantsSize;
	
	public Hulk() {
		// TODO Auto-generated constructor stub
	}

	public Hulk(String realName, int age, int pantsSize) {
		super(realName, age);
		this.pantsSize = pantsSize;
	}

	public int getPantsSize() {
		return pantsSize;
	}

	public void setPantsSize(int pantsSize) {
		this.pantsSize = pantsSize;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(pantsSize);
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("¡÷∏‘¡˙");
	}

}
