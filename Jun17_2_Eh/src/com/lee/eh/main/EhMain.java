package com.lee.eh.main;

import java.io.FileReader;
import java.util.Scanner;

import com.lee.jun17eh.calculator.Calculator;

// JAVA 
//		����ó���� ����(���ϸ� ����) - ���̽��� ���ص� ��
//		���� : �ʺ���
//		���� : ó���ϱ� �������� try or throws

public class EhMain {
	public static void main(String[] args) {
		
//		Thread.sleep(3000); // ����ó���� ����(���ϸ� ����)
//		FileReader fr = new FileReader("D:\\a.txt"); // ����ó���� ����(���ϸ� ����)
		
		Scanner k = new Scanner(System.in);
		System.out.println("���� : ");
		int price = k.nextInt();

		System.out.println("���� : ");
		int weight = k.nextInt();

		try {
			int b = Calculator.divide2(price, weight);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("�� �װ� �ƴմϴ�");
		}

//		int a = Calculator.divide(price, weight);
//		System.out.println(a);

	}

}
