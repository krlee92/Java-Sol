package com.lee.uc.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//Map�迭 : ����������, �����ý���-x, Ű-�� �� - 
//HashMap, HashTable, ...
//potato -> ����

public class UCMain5 {
	public static void main(String[] args) {
//		HashMap<Ű������ ã����, ������ ���> hm = new HashMap<String, Integer>();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("ź��ȭ��", 50);
		hm.put("����", 500);
		hm.put("�ܹ���", 5000);
		
		System.out.println( hm.get("����") );
		System.out.println("------");
		
		// �л� �̸����� ã���� �л� ��ü�� ��������
		HashMap<String, Student> students = new HashMap<String, Student>();
		students.put("ȫ�浿", new Student("ȫ�浿", 20, 100, 0, 0));
		students.put("��浿", new Student("��浿", 30, 10, 20, 30));
		students.put("�̱浿", new Student("�̱浿", 40, 100, 30, 0));
		Scanner k = new Scanner(System.in);
		System.out.println("���� :");
		String name = k.next();
		students.get(name).print();
		System.out.println("-------");
		
		// Ű ����
		Set<String> sNames = students.keySet();
		ArrayList<String> sName2 = new ArrayList<String>(sNames);
		for (String s : sName2) {
			System.out.println(s);
		}
		
	}

}
