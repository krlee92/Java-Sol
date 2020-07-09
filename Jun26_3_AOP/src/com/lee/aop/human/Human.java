package com.lee.aop.human;

public class Human {
	
	public void ready() {
		System.out.println("씻기");
		System.out.println("옷입기");
		System.out.println("신발신기");

	}
	
	public void goSchool() {
		ready();
		System.out.println("자전거타고");
		System.out.println("학교도착");
		System.out.println("...");
	}
	
	public void goMart() {
		ready();
		System.out.println("버스타고");
		System.out.println("지하철 갈아타고");
		System.out.println("마트도착");
		System.out.println("...");
	}
	
	
}
