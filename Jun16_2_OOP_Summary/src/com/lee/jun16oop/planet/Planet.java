package com.lee.jun16oop.planet;

import com.lee.jun16oop.human.Human;

public class Planet {
	private String name;
	private int size;
	private boolean visible;
	private Human human;
	
	

	

	public Planet() {
		// TODO Auto-generated constructor stub
	}
	
	public Planet(String name) {
		super();
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public void add(Human human) {
		this.human = human;
		System.out.println(name +"에 사람하나 들어옴");
	}

	public void print() {
		System.out.println(name);
	}

}
