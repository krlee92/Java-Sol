package com.lee.jun16oop.product;

public class Icecream extends Product{
	
	// 상위클래스 속성 외, 추가할속성이없을때 생성자 추가는
//			우클릭 소스 - constructors from superclass
	
	public Icecream(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public Icecream() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
	}
	
	@Override
	public void notice() {
		System.out.println("냉동보관");
	}
	

}
