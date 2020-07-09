// ����������,����������(access modifier)
//		������� ���� ������ ������ ����,����
//		public : ��𼭵� ���� ����
//		protected : ���� ��Ű�������� or �ٸ���Ű���� ��Ӱ��� : ������ ��Ӱ����̾ ������...
//			: �Ⱦ��°�..  ���� ��Ű�������� (friendly/default) 
//		private : ���� Ŭ���� ��������
//		
package com.lee.jun15oop.coffee;

public class Coffee {
	String name;
	int price;
	
	public int a;
	protected int b;
	int c;
	private int d;
	
	
	public Coffee() {
	}

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
	
	

}
