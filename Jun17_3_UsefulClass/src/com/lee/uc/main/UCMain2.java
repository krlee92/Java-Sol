package com.lee.uc.main;

// �⺻�� ������ : �����Ͱ� stack�� ����
// ������ ������ : �����Ͱ� heap�� ����, ������
// �����Ͱ� heap�� �־�� �� ���� ����
// Wrapper Class : �⺻���� �����ϴ� Ŭ����
//						ù���ڸ� �빮���� �⺻��������
// 
public class UCMain2 {
	public static void main(String[] args) {
		int a = 10; //�⺻�� 10
		Integer aa = new Integer(10); // ������ 10(int�ǰ�ü����)
		
		double b = 123.12;
		Double bb = new Double(123.12); // double�� ��ü����(������,heap)
		System.out.println("-----------------");
		// �⺻�� -> Wrapper������ ����ȯ
		int c = 100;
		Integer cc = new Integer(c);
		
		// Wrapper�� -> �⺻��
		int ccc = cc.intValue();
		System.out.println("-----------------");
		
		// autoboxing, autounboxing ��� @@@�̰ɾ�@@@
		double d = 234.21;
		Double dd = d; // autoboxing, ���̼��� �����ʹ� ���� �������̶� �����Ͱ� �ڹٺ��� ���� �Ҹ��
		double ddd= dd;// autounboxing
		System.out.println("--------------------");
		// �⺻�� -> String
		int e = 123;
		String ee = e + "";
		String eee = String.format("%d", e);
		
		// String -> �⺻��
		String f = "1234";
		Integer fff = Integer.parseInt(f);
		int ff = fff.intValue(); // �����ε� �Ⱦ�
		
		String g = "34.21";
		double gg = Double.parseDouble(g); // �ٷ� �ٲٱ�
		System.out.println("-----------------");
		
		
		
		
	}

}
