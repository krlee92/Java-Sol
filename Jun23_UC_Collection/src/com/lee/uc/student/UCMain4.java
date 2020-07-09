package com.lee.uc.student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

//Set�迭 : ����������, �ߺ��ڵ�����(�⺻����, �ܼ� ����, ����), ��������
//HashSet, TreeSet, ...
//0->?
// �߾Ⱦ�..
public class UCMain4 {
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(30);
		System.out.println(hs.size());
		// Set -> List�� �ٲ㼭 ���
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		for (Integer i : al) {
			System.out.println(i);
		}
		System.out.println("===========");
		HashSet<Student> students  = new HashSet<Student>();
		students.add(new Student("ȫ�浿", 20, 100, 0, 0));
		students.add(new Student("ȫ�浿", 20, 100, 0, 0)); // �ߺ��� �ƴϴ�
		Student s = new Student("��浿", 30, 0, 0, 0);
		students.add(s);
		students.add(s); //�̰� �ߺ�
		
		System.out.println(students.size());
		System.out.println("================");
		
		// �ζ� ��ȣ ���
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<Integer>();
		while (true) {
			lotto.add(r.nextInt(45)+1);
			if (lotto.size() == 6) {
				break;
			}
		}
		ArrayList<Integer> lotto2 = new ArrayList<Integer>(lotto);
		for (Integer i : lotto2) {
			System.out.println(i);
		}
		
		
	}

}
