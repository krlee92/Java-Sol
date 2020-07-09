package com.lee.jun16oop.avengers;

// Avengers : 추상적 존재(상품,인류,...)

// 추상클래스 : 객체를 만들지 못함
//		추상 메소드가 있으면 추상 클래스이어야 함
//				추상 메소드 : 존재하면 하위클래스에서 반드시 오버라이딩 해야함

// 다중상속 - x - 라인은 하나만 타야함(파이썬은 됨)
// Ironman is a Avengers
// Ironman is a Human

public abstract class Avengers { //추상클래스 
	private String realName;
	private int age;
	
	public Avengers() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Avengers(String realName, int age) {
		super();
		this.realName = realName;
		this.age = age;
	}

	public String getRealName() {
		return realName;
	}


	public void setRealName(String realName) {
		this.realName = realName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void print() {
		System.out.println(realName);
		System.out.println(age);
	}
	
	// 추상 메소드 : 구현안된(내용없는) 메소드
//			하위클래스에서 반드시 오버라이딩 해야함
	public abstract void attack(); // 추상 메소드
		
	

}
