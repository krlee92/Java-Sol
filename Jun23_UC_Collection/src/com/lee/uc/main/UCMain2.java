package com.lee.uc.main;

import java.util.ArrayList;

//List�迭 : ����������迭 - ���� ���� ���
//ArrayList, Vector, ...
//0->��



public class UCMain2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(123);
		al.add("��"); // �ڷ��� ��� �ִ°͵� ����
		System.out.println(al.size()); // arraylist�� length��� size
		System.out.println("-----------");
		
		// <Ŭ������> : generic -> �� ��ü(�ڷ���)�� ����
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("z");
		al2.add("w");
		al2.add("ky");
		System.out.println(al2.size());
		System.out.println(al2.get(0));
		
		String t = null;
		for (int i = 0; i < al2.size(); i++) {
			t=al2.get(i);
//			System.out.println(al2.get(i));
			System.out.println(t);
			System.out.println("----------");
		}
		
		al2.add("����������");
		al2.add(1, "wwww"); // 1����ġ�� �߰�
		al2.set(2, "ttttt"); // 2���ڸ��� �ٲٱ�
		al2.remove(0); // 0���ڸ��� ����
		
		
		for (String t2 : al2) {
			System.out.println(t2);
		}
		System.out.println("-----------");
		ArrayList<Integer> al3 = new ArrayList<Integer>(); // ��ü�� ����,�⺻�� int �ȴ�
		al3.add(10); // heap�� 10 ����
		al3.add(30);
		System.out.println("------------");
		
// �л�
//		�̸�
//		����
//		����
//		����
//		����
//		�������
		
		
		
	}

}
