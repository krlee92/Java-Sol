package com.lee.jun15oop.human;

// singleton pattern(중요)

// static : 객체들의 공통적인 속성이므로 여기선 안씀.(객체들x,권기웅은 한명뿐임)

// 객체를 하나만 - singleton pattern
					
//객체
//있어야하는지 따지는것 
//멤버변수 유무
//	무 : 없어도 됨 -> 메소드를 static 기반
//	유 : 있어야 함
//			하나 : singleton pattern
//			여러개 : factory pattern

public class KwonKiUng {
	
//	2. 클래스 내부에서 하나 만들어서
	private static final KwonKiUng KKU = new KwonKiUng("권기웅",34,"분당");
	 
	private String name;
	private int age;
	private String adress;
	
//					1. 객체를 외부에서 만들지 못하게 private
	private KwonKiUng() { // 1.
	}

	private KwonKiUng(String name, int age, String adress) { // 1.
		super();
		this.name = name;
		this.age = age;
		this.adress = adress;
	}

//	3. 2.에서 만든 객체 외부에서 가져가 쓸 수 있게
	public String getName() {
		return name;
	}

	public static KwonKiUng getKku() {
		return KKU;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(adress);
	}

}
