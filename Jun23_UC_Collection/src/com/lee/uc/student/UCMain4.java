package com.lee.uc.student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

//Set계열 : 가변사이즈, 중복자동제거(기본형급, 단순 숫자, 글자), 순서랜덤
//HashSet, TreeSet, ...
//0->?
// 잘안씀..
public class UCMain4 {
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(30);
		System.out.println(hs.size());
		// Set -> List로 바꿔서 사용
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		for (Integer i : al) {
			System.out.println(i);
		}
		System.out.println("===========");
		HashSet<Student> students  = new HashSet<Student>();
		students.add(new Student("홍길동", 20, 100, 0, 0));
		students.add(new Student("홍길동", 20, 100, 0, 0)); // 중복이 아니다
		Student s = new Student("김길동", 30, 0, 0, 0);
		students.add(s);
		students.add(s); //이게 중복
		
		System.out.println(students.size());
		System.out.println("================");
		
		// 로또 번호 출력
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
