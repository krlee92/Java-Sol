package com.lee.jun16oop.avengers;

// Avengers : �߻��� ����(��ǰ,�η�,...)

// �߻�Ŭ���� : ��ü�� ������ ����
//		�߻� �޼ҵ尡 ������ �߻� Ŭ�����̾�� ��
//				�߻� �޼ҵ� : �����ϸ� ����Ŭ�������� �ݵ�� �������̵� �ؾ���

// ���߻�� - x - ������ �ϳ��� Ÿ����(���̽��� ��)
// Ironman is a Avengers
// Ironman is a Human

public abstract class Avengers { //�߻�Ŭ���� 
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
	
	// �߻� �޼ҵ� : �����ȵ�(�������) �޼ҵ�
//			����Ŭ�������� �ݵ�� �������̵� �ؾ���
	public abstract void attack(); // �߻� �޼ҵ�
		
	

}
