package com.lee.uc.student;

import java.util.ArrayList;
import java.util.Comparator;

public class UCMain3 {
	public static void main(String[] args) {
		// �л�
//		�̸�
//		����
//		����
//		����
//		����
//		�������		
		
		ArrayList<Student> students = new ArrayList<Student>();
		Student s = new Student("ȫ�浿", 20, 100, 90, 80);
		students.add(s);
		students.add(new Student("��浿", 22, 10, 20, 30));
		students.add(new Student("�̱浿", 32, 13, 34, 50));
		students.add(new Student("�ֱ浿", 22, 50, 20, 70));
		students.add(new Student("�ڱ浿", 42, 20, 20, 36));
		students.add(new Student("���浿", 55, 18, 88, 77));
		
		// �л� ��
		System.out.println(students.size());
		
		
		// �ι�° �л� ��������
		System.out.println(students.get(1).getKor());
		
		// ����° �л� �̸�
		System.out.println(students.get(2).getName());
		
		// ù��° �л� ����
		System.out.println(students.get(0).getAge());
		students.get(0).print();
		System.out.println("---------");
		
		// ������� ���
		for (Student student : students) {
			student.print();
			System.out.println("------");
		}
		System.out.println("===========");
		// �̸� �����ټ�
		Comparator<Student> c = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				String o1name = o1.getName();
				String o2name = o2.getName();
				
				return o1name.compareTo(o2name); // o1���� �������� o2���� ��������
				
			}
			
		};
		students.sort(c);
		for (Student student : students) {
			student.print();
			System.out.println("------");
		}
		// ���� ����������� ���
		// String�� ��ü�ϱ� compareTo�޼ҵ尡 �ִµ�
		// int�� ��ü�� �ƴϴ� �޼ҵ尡 ���� �� ����
		Comparator<Student> c2 = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				Integer o1Age = o1.getAge();
				Integer o2Age = o2.getAge();
				return o2Age.compareTo(o1Age);
			}
		};
		students.sort(c2);
		for (Student student : students) {
			student.print();
			System.out.println("-------");
		}
		// ������ ���
		
		Comparator<Student> c3 = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				Double o1Avg = (o1.getKor() + o1.getEng() + o1.getMat()) / 3.0;
				Double o2Avg = (o2.getKor() + o2.getEng() + o2.getMat()) / 3.0;
				return o2Avg.compareTo(o1Avg);
			}
		};
		students.sort(c3);
		for (Student student : students) {
			student.print();
			System.out.println("-------");
		}
		// 1�� �л� ��ü ���� ��� - ������ ������ ������ �س���
		students.get(0).print();
		
		// �õ� �л� ��ü ���� ���
		students.get(students.size() -1).print();
		
	}

}
