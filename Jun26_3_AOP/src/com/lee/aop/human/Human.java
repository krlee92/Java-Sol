package com.lee.aop.human;

public class Human {
	
	public void ready() {
		System.out.println("�ı�");
		System.out.println("���Ա�");
		System.out.println("�Ź߽ű�");

	}
	
	public void goSchool() {
		ready();
		System.out.println("������Ÿ��");
		System.out.println("�б�����");
		System.out.println("...");
	}
	
	public void goMart() {
		ready();
		System.out.println("����Ÿ��");
		System.out.println("����ö ����Ÿ��");
		System.out.println("��Ʈ����");
		System.out.println("...");
	}
	
	
}
