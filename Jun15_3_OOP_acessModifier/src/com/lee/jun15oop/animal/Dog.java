package com.lee.jun15oop.animal;

public class Dog {
	public String name;
	public int age;
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}

}
