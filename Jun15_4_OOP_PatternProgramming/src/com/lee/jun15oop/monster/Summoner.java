package com.lee.jun15oop.monster;

import java.util.Random;

// 2. ������ ���� Ŭ���� ����.
public class Summoner {
	private Random brain;
	
	public Summoner() {
		brain = new Random();
	}
	
//	3. ��ü ���� �޼ҵ�
	public Monster Summon() {
		int hp = brain.nextInt(101);
		int mp = brain.nextInt(101);
		int atk = brain.nextInt(101);
		return new Monster(hp, mp, atk);
				
	}

}
