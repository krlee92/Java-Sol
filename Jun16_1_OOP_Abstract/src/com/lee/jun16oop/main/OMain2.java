package com.lee.jun16oop.main;

import com.lee.jun16oop.product.Apple;
import com.lee.jun16oop.product.Icecream;
import com.lee.jun16oop.product.Pen;

public class OMain2 {
	public static void main(String[] args) {
		// Ư����Ʈ, 20000��, 5kg ���
		// �������
		// ���ǻ��� ����ϱ� - �ľ���
		//--------------------------------
		// �ҽ���, 500�� �� ���̽�ũ��
		// �������
		// ���ǻ��� ����ϱ� - �õ�����
		//--------------------------------
		// �𳪹�153, 300��, �Ķ� ��
		// �������
		// ���ǻ��� ����ϱ� - ������
		Apple a = new Apple("Ư����Ʈ", 20000, 5);
		a.printInfo();
		a.notice();
		System.out.println("-------");
		Icecream i = new Icecream("�ҽ���", 500);
		i.printInfo();
		i.notice();
		System.out.println("-------");
		Pen p = new Pen("�𳪹�153", 300, "�Ķ�");
		p.printInfo();
		p.notice();
		
	}

}
