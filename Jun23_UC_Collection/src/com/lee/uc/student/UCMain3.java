package com.lee.uc.student;

import java.util.ArrayList;
import java.util.Comparator;

public class UCMain3 {
	public static void main(String[] args) {
		// 학생
//		이름
//		나이
//		국어
//		영어
//		수학
//		정보출력		
		
		ArrayList<Student> students = new ArrayList<Student>();
		Student s = new Student("홍길동", 20, 100, 90, 80);
		students.add(s);
		students.add(new Student("김길동", 22, 10, 20, 30));
		students.add(new Student("이길동", 32, 13, 34, 50));
		students.add(new Student("최길동", 22, 50, 20, 70));
		students.add(new Student("박길동", 42, 20, 20, 36));
		students.add(new Student("강길동", 55, 18, 88, 77));
		
		// 학생 수
		System.out.println(students.size());
		
		
		// 두번째 학생 국어점수
		System.out.println(students.get(1).getKor());
		
		// 세번째 학생 이름
		System.out.println(students.get(2).getName());
		
		// 첫번째 학생 나이
		System.out.println(students.get(0).getAge());
		students.get(0).print();
		System.out.println("---------");
		
		// 모든정보 출력
		for (Student student : students) {
			student.print();
			System.out.println("------");
		}
		System.out.println("===========");
		// 이름 가나다순
		Comparator<Student> c = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				String o1name = o1.getName();
				String o2name = o2.getName();
				
				return o1name.compareTo(o2name); // o1관련 오름차순 o2관련 내림차순
				
			}
			
		};
		students.sort(c);
		for (Student student : students) {
			student.print();
			System.out.println("------");
		}
		// 나이 많은사람부터 출력
		// String은 객체니까 compareTo메소드가 있는데
		// int는 객체가 아니니 메소드가 있을 수 없다
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
		// 성적순 출력
		
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
		// 1등 학생 전체 정보 출력 - 위에서 성적순 정렬을 해놨다
		students.get(0).print();
		
		// 꼴등 학생 전체 정보 출력
		students.get(students.size() -1).print();
		
	}

}
