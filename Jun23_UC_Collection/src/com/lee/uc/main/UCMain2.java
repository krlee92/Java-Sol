package com.lee.uc.main;

import java.util.ArrayList;

//List계열 : 가변사이즈배열 - 가장 많이 사용
//ArrayList, Vector, ...
//0->ㅋ



public class UCMain2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(123);
		al.add("ㅋ"); // 자료형 섞어서 넣는것도 가능
		System.out.println(al.size()); // arraylist는 length대신 size
		System.out.println("-----------");
		
		// <클래스명> : generic -> 그 객체(자료형)로 강제
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
		
		al2.add("ㅋㅋㅋㅋㅋ");
		al2.add(1, "wwww"); // 1번위치에 추가
		al2.set(2, "ttttt"); // 2번자리값 바꾸기
		al2.remove(0); // 0번자리값 삭제
		
		
		for (String t2 : al2) {
			System.out.println(t2);
		}
		System.out.println("-----------");
		ArrayList<Integer> al3 = new ArrayList<Integer>(); // 객체만 가능,기본형 int 안댐
		al3.add(10); // heap에 10 저장
		al3.add(30);
		System.out.println("------------");
		
// 학생
//		이름
//		나이
//		국어
//		영어
//		수학
//		정보출력
		
		
		
	}

}
