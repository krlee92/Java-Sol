package com.lee.jun15oop.monster;

// factory pattern

public class Monster {
	
	private int hp;
	private int mp;
	private int atk;
	
//	1.같은 패키지에서만 생성 가능하게
//		2.3은 서모너
	Monster() {
		// TODO Auto-generated constructor stub
	}

	Monster(int hp, int mp, int atk) {
		super();
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public void showInfo() {
		System.out.println(hp);
		System.out.println(mp);
		System.out.println(atk);
	}
	

}
