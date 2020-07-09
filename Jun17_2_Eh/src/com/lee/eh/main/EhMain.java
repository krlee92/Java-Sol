package com.lee.eh.main;

import java.io.FileReader;
import java.util.Scanner;

import com.lee.jun17eh.calculator.Calculator;

// JAVA 
//		예외처리가 강제(안하면 에러) - 파이썬은 안해도 됨
//		장점 : 초보자
//		단점 : 처리하기 싫은데도 try or throws

public class EhMain {
	public static void main(String[] args) {
		
//		Thread.sleep(3000); // 예외처리가 강제(안하면 에러)
//		FileReader fr = new FileReader("D:\\a.txt"); // 예외처리가 강제(안하면 에러)
		
		Scanner k = new Scanner(System.in);
		System.out.println("가격 : ");
		int price = k.nextInt();

		System.out.println("무게 : ");
		int weight = k.nextInt();

		try {
			int b = Calculator.divide2(price, weight);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("아 그거 아닙니다");
		}

//		int a = Calculator.divide(price, weight);
//		System.out.println(a);

	}

}
