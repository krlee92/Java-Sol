package com.lee.jun16oop.human;

import com.kwon.jun16oop.avengers.Ironman;
import com.kwon.jun16oop.main.Avengers;

public class Human {
	private String name;
//	private Ironman hero; // ������ ��� �޸��� ���̾���� ������?
	private Avengers hero;


	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name) {
		super();
		this.name = name;
	}
	
	public void pick(Avengers hero) {
		this.hero = hero;
	}
	
	public void somebodyHelpMe() {
		hero.attack();
	}
}
