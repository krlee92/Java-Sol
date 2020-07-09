package com.lee.jun15oop.main;

import java.util.Scanner;

import com.lee.jun15oop.animal.Bug;
import com.lee.jun15oop.animal.Dog;
import com.lee.jun15oop.coffee.Coffee;
import com.lee.jun15oop.menu.Menu;

public class OMain {
	public static void main(String[] args) {
		// �ܼ��Է¹����غ�
//			������ü ����
//			�̸� �Է¹޾Ƽ� ���� �̸����� ����
//			ũ�� �Է¹޾Ƽ� ���� ũ��� ����
//			���� ���� ���
		Scanner k = new Scanner(System.in);
		Bug b = new Bug();
		System.out.print("�̸� : ");
//		b.name = k.next();
		b.setName(k.next());
		System.out.print("ũ�� : ");
//		b.size = k.nextInt();
		b.setSize(k.nextInt());
		b.printInfo();
		System.out.println("----------------");
		// �޴���ü ����
//			�޴���
//			�� �� �� �³�
//			���� ���
		Menu m = new Menu();
		m.setName("��");
		m.setPrice(0);
		m.setGood(false);
		m.showInfo();
		
		System.out.println("----------------");
		Coffee a = new Coffee("�Ƹ޸�ī��", 4000);
		a.printInfo();
		System.out.println("----------------");
		// ���� ����
//				�ǻ�
//				2��
//				���
		Dog d = new Dog();
		d.name = "�ǻ�";
		d.age = 2;
		d.printInfo(); 
	}

}
