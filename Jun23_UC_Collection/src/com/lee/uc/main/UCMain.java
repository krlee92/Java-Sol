package com.lee.uc.main;

import java.util.Arrays;

//	[] : ���� �� ����� ����
//		=> ������ ���� �Ұ�
//		=> ���� �� ������ �𸣸�?
//		�ڵ尡 �˾ƺ��� ����

// Collection - ��ü��(int double...�ȴ�)

//	List�迭 : ����������迭 - ���� ���� ���
//		ArrayList, Vector, ...
//		0->��
//	Set�迭 : ����������, �ߺ��ڵ�����, ��������
//		HashSet, TreeSet, ...
//		0->?
//	Map�迭 : ����������, �����ý���-x, Ű-�� �� - 
//		HashMap, HashTable, ...
//		potato -> ����
public class UCMain {
	public static void main(String[] args) {
		int[] ar = new int[5]; // 5ĭ¥�� int���� �� �迭
		int[] ar2 = { 123, 1, 45, 4, 21 }; // ������ 5�� �־ �迭 �����
		// ar[5] = 10;
		// ar2[5] = 100; 	// ������ �߰� �Ұ���
		System.out.println(ar2[3]); // �ڵ常 ���� �� �ǹ��ϳ�?
		Arrays.sort(ar2);	// �迭 �����ϱ�
		for (int i : ar2) {
			System.out.println(i);
		}
		System.out.println("---------------");
		

	}
}





