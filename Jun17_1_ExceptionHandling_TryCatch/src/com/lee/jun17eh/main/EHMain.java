package com.lee.jun17eh.main;

import java.util.Scanner;

import com.lee.jun17eh.calculator.Calculator;

// �ѱ��� -����-> .java
// .java -������->  ����(.class)
// .class -����-> �ϼ����α׷�(.jar)
// .jar -����->

// error : java ������ �ȸ¾Ƽ� ������ �Ұ� dsfsdfqe
//			�ϼ�ǰ�� ������ ����
//			������ ������ �߸�
// warning : ������ �ڵ�(�����������ڵ带 �����, ��ĳ�� ���� �ݾƾ�)
//			�ϼ�ǰ ����(���࿡�� �������)
//			������ �߸�
// exception(����) : �������� ���α׷�
//					�����ϴ� ������ �ܺ����� �������� ����� �ȵǴ� ��Ȳ
//					������ �߸� x -> ���

public class EHMain {
	public static void main(String[] args) {
		// ����
		//		������ 2�� ������ ��Ģ���� ����� ����ϴ� ���
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		System.out.print("y : ");
		int y = k.nextInt();
//		a/0 = ���� �������� ����
		
		int ans = Calculator.divide(x, y);
		System.out.println(ans);
		
		try {
			int ans2 = Calculator.divide2(x, y);
			System.out.println(ans2);
		} catch (Exception e) {
			System.out.println("������ 0�� �����");
		}
		
		
		
	}

}

