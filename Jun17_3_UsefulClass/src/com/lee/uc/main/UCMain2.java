package com.lee.uc.main;

// 기본형 데이터 : 데이터가 stack에 저장
// 참조형 데이터 : 데이터가 heap에 저장, 빨간색
// 데이터가 heap에 있어야 할 때가 있음
// Wrapper Class : 기본형에 대응하는 클래스
//						첫글자만 대문자인 기본형데이터
// 
public class UCMain2 {
	public static void main(String[] args) {
		int a = 10; //기본형 10
		Integer aa = new Integer(10); // 참조형 10(int의객체버전)
		
		double b = 123.12;
		Double bb = new Double(123.12); // double의 객체버전(참조형,heap)
		System.out.println("-----------------");
		// 기본형 -> Wrapper형으로 형변환
		int c = 100;
		Integer cc = new Integer(c);
		
		// Wrapper형 -> 기본형
		int ccc = cc.intValue();
		System.out.println("-----------------");
		
		// autoboxing, autounboxing 기능 @@@이걸씀@@@
		double d = 234.21;
		Double dd = d; // autoboxing, 파이선의 데이터는 전부 참조형이라 데이터가 자바보다 많이 소모됨
		double ddd= dd;// autounboxing
		System.out.println("--------------------");
		// 기본형 -> String
		int e = 123;
		String ee = e + "";
		String eee = String.format("%d", e);
		
		// String -> 기본형
		String f = "1234";
		Integer fff = Integer.parseInt(f);
		int ff = fff.intValue(); // 정석인데 안씀
		
		String g = "34.21";
		double gg = Double.parseDouble(g); // 바로 바꾸기
		System.out.println("-----------------");
		
		
		
		
	}

}
