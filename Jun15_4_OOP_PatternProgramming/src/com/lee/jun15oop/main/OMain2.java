package com.lee.jun15oop.main;

import com.lee.jun15oop.monster.Monster;
import com.lee.jun15oop.monster.Summoner;

public class OMain2 {
	public static void main(String[] args) {
		// HP100, MP50, ATK10 ����
		// ���
//		Monster m1 = new Monster(100, 50, 10);
//		m1.showInfo();
		System.out.println("-------------------");
		// HP200, MP150, ATK100 ����
//		// ���
//		Monster m2 = new Monster(200, 150, 100);
//		m2.showInfo();
		System.out.println("-------------------");
//		factory pattern
		// ���忪�� ��ȯ��
		Summoner s = new Summoner();
		
		// ���忡�� ������
		Monster m3 = s.Summon();
		m3.showInfo();
		System.out.println("-------------------");
		Monster m4 = s.Summon();
		m4.showInfo();
		System.out.println("-------------------");
		Monster m5 = s.Summon();
		m5.showInfo();
		System.out.println("-------------------");
		Monster m6 = s.Summon();
		m6.showInfo();
	}

}
