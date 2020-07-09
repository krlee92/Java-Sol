package com.lee.jun15oop.human;

// singleton pattern(�߿�)

// static : ��ü���� �������� �Ӽ��̹Ƿ� ���⼱ �Ⱦ�.(��ü��x,�Ǳ���� �Ѹ����)

// ��ü�� �ϳ��� - singleton pattern
					
//��ü
//�־���ϴ��� �����°� 
//������� ����
//	�� : ��� �� -> �޼ҵ带 static ���
//	�� : �־�� ��
//			�ϳ� : singleton pattern
//			������ : factory pattern

public class KwonKiUng {
	
//	2. Ŭ���� ���ο��� �ϳ� ����
	private static final KwonKiUng KKU = new KwonKiUng("�Ǳ��",34,"�д�");
	 
	private String name;
	private int age;
	private String adress;
	
//					1. ��ü�� �ܺο��� ������ ���ϰ� private
	private KwonKiUng() { // 1.
	}

	private KwonKiUng(String name, int age, String adress) { // 1.
		super();
		this.name = name;
		this.age = age;
		this.adress = adress;
	}

//	3. 2.���� ���� ��ü �ܺο��� ������ �� �� �ְ�
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
