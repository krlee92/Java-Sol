package com.lee.jun16oop.avengers;

import com.lee.jun16oop.human.Driver;
import com.lee.jun16oop.human.Smoker;

//���߻�� - x
//Ironman is a Avengers
//Ironman is a Smoker
//Ironman is a Driver

public class Ironman extends Avengers implements Smoker, Driver{ //����Ŀ�� �����Ѵ�
	
	private String comName;
	
	public Ironman() {
		// TODO Auto-generated constructor stub
	}
	
	@Override // ���� ���ϸ� ����
	public void smoke() {
		System.out.println("��");
	}
	
	@Override
	public void drive() {
		System.out.println("��ƮȮ���ϼ���");
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
		System.out.println("�� �߻�");
	}
	
}
