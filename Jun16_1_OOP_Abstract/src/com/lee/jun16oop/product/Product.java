package com.lee.jun16oop.product;

public abstract class Product { //��ǰ�̶� ��ü�� ������ �ʱ⶧���� �߻�޼ҵ�
	
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
	
	public abstract void notice(); //����Ŭ�������� �ݵ�� �����ؾ��ϴ�
//									�߻� �޼ҵ�, �������� ���°� �ƴ϶�.
		
	
		
	
}
