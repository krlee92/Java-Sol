package com.lee.uc.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//Map계열 : 가변사이즈, 순서시스템-x, 키-값 쌍 - 
//HashMap, HashTable, ...
//potato -> 감자

public class UCMain5 {
	public static void main(String[] args) {
//		HashMap<키값으로 찾으면, 지정값 출력> hm = new HashMap<String, Integer>();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("탄수화물", 50);
		hm.put("지방", 500);
		hm.put("단백질", 5000);
		
		System.out.println( hm.get("지방") );
		System.out.println("------");
		
		// 학생 이름으로 찾으면 학생 객체가 나가도록
		HashMap<String, Student> students = new HashMap<String, Student>();
		students.put("홍길동", new Student("홍길동", 20, 100, 0, 0));
		students.put("김길동", new Student("김길동", 30, 10, 20, 30));
		students.put("이길동", new Student("이길동", 40, 100, 30, 0));
		Scanner k = new Scanner(System.in);
		System.out.println("누구 :");
		String name = k.next();
		students.get(name).print();
		System.out.println("-------");
		
		// 키 값만
		Set<String> sNames = students.keySet();
		ArrayList<String> sName2 = new ArrayList<String>(sNames);
		for (String s : sName2) {
			System.out.println(s);
		}
		
	}

}
