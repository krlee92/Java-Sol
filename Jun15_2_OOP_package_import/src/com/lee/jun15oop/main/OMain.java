package com.lee.jun15oop.main;
//	��Ű�� : Ŭ������ �ߺ��� �� ������ ����

//			=> �� ���������� �ߺ� �ȵǰ� ������
//			com.ȸ���.������Ʈ��.����
//			kr.co.ȸ���
//			....
//			default ��Ű�� �Ⱦ���

//		Ŭ���� - ��Ű�� �ȿ�

//ctrl + shift + o : import ����. ���°� �־��ְ� �������°� ���ְ�
import java.util.Scanner;

// ��Ű���� ���� �����Ѱ��- ���������Ѱ� ������
//		1.�ڹ� �⺻ ��Ű��(java.lang)
//			java.lang.String s = new java.lang.String("��");
//			->String s = new String("��");
//		2.���� ��Ű�� �ȿ� ������
//			OMain2 o = new OMain2();
//		3.OMain������ ���� ����� ���Ŵ� = ȸ�� ����� �Ⱦ��ٴ°�
//			ȸ�� ����� ������ ���� Ǯ���� ����� -> com.lee.jun15oop.company.Apple a2 = new com.lee.jun15oop.company.Apple();
import com.lee.jun15oop.fruit.Apple; // 21���� �ڹٷι����Ѱ�.
// ���� ���⼭ Apple���� �װŴ� fruit��Ű���� Apple

public class OMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Apple aa = new Apple();
		aa.test();

		com.lee.jun15oop.fruit.Apple a1 = new com.lee.jun15oop.fruit.Apple();
		a1.test();

		com.lee.jun15oop.company.Apple a2 = new com.lee.jun15oop.company.Apple();
		a2.test();

	}

}
