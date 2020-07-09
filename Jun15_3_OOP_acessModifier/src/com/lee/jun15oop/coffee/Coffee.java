// 접근제어자,접근지정자(access modifier)
//		멤버들의 접근 가능한 범위를 지정,제어
//		public : 어디서든 접근 가능
//		protected : 같은 패키지에서만 or 다른패키지면 상속관계 : 실제로 상속관계이어도 못쓴다...
//			: 안쓰는거..  같은 패키지에서만 (friendly/default) 
//		private : 같은 클래스 내에서만
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
