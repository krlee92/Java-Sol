package com.lee.jun16oop.product;

public class Icecream extends Product{
	
	// ����Ŭ���� �Ӽ� ��, �߰��ҼӼ��̾����� ������ �߰���
//			��Ŭ�� �ҽ� - constructors from superclass
	
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
		System.out.println("�õ�����");
	}
	

}
