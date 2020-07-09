package com.lee.jun16oop.human;

public interface Smoker { //interface - 상수,추상메소드만 가능한것 
//	String tabacco; // 멤버변수 x
	public static final String SAY = "나 오늘부터 끊는다"; // 상수는 가능
	
//	public void print() {} 메소드 x 
	
	public abstract void smoke(); // 추상메소드는 가능

}
