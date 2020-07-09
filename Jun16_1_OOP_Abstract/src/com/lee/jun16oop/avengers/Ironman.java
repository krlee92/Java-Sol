package com.lee.jun16oop.avengers;

import com.lee.jun16oop.human.Driver;
import com.lee.jun16oop.human.Smoker;

//다중상속 - x
//Ironman is a Avengers
//Ironman is a Smoker
//Ironman is a Driver

public class Ironman extends Avengers implements Smoker, Driver{ //스모커를 구현한다
	
	private String comName;
	
	public Ironman() {
		// TODO Auto-generated constructor stub
	}
	
	@Override // 구현 안하면 에러
	public void smoke() {
		System.out.println("휴");
	}
	
	@Override
	public void drive() {
		System.out.println("벨트확인하세요");
	}

	public Ironman(String realName, int age, String comName) {
		super(realName, age);
		this.comName = comName;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(comName);
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("빔 발사");
	}
	
}
