package com.lee.jun15oop.monster;

import java.util.Random;

// 2. 괴물찍어낼 공장 클래스 역할.
public class Summoner {
	private Random brain;
	
	public Summoner() {
		brain = new Random();
	}
	
//	3. 객체 만들 메소드
	public Monster Summon() {
		int hp = brain.nextInt(101);
		int mp = brain.nextInt(101);
		int atk = brain.nextInt(101);
		return new Monster(hp, mp, atk);
				
	}

}
