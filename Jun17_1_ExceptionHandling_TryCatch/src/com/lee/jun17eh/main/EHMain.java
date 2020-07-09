package com.lee.jun17eh.main;

import java.util.Scanner;

import com.lee.jun17eh.calculator.Calculator;

// 한국어 -개발-> .java
// .java -컴파일->  기계어(.class)
// .class -압축-> 완성프로그램(.jar)
// .jar -실행->

// error : java 문법에 안맞아서 컴파일 불가 dsfsdfqe
//			완성품이 나오지 않음
//			에러는 개발자 잘못
// warning : 더러운 코드(쓰지도않을코드를 만든다, 스캐너 쓰고 닫아야)
//			완성품 나옴(실행에는 영향없음)
//			개발자 잘못
// exception(예외) : 정상적인 프로그램
//					실행하는 순간에 외부적인 요인으로 제대로 안되는 상황
//					개발자 잘못 x -> 대비

public class EHMain {
	public static void main(String[] args) {
		// 계산기
		//		정수를 2개 넣으면 사칙연산 결과를 출력하는 기능
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		System.out.print("y : ");
		int y = k.nextInt();
//		a/0 = 세상에 존재하지 않음
		
		int ans = Calculator.divide(x, y);
		System.out.println(ans);
		
		try {
			int ans2 = Calculator.divide2(x, y);
			System.out.println(ans2);
		} catch (Exception e) {
			System.out.println("나누기 0이 어딨냐");
		}
		
		
		
	}

}

