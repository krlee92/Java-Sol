package com.lee.uc.main;

import java.util.Arrays;

//	[] : 만들 때 사이즈가 고정
//		=> 사이즈 수정 불가
//		=> 만들 때 사이즈 모르면?
//		코드가 알아보기 힘듬

// Collection - 객체만(int double...안댐)

//	List계열 : 가변사이즈배열 - 가장 많이 사용
//		ArrayList, Vector, ...
//		0->ㅋ
//	Set계열 : 가변사이즈, 중복자동제거, 순서랜덤
//		HashSet, TreeSet, ...
//		0->?
//	Map계열 : 가변사이즈, 순서시스템-x, 키-값 쌍 - 
//		HashMap, HashTable, ...
//		potato -> 감자
public class UCMain {
	public static void main(String[] args) {
		int[] ar = new int[5]; // 5칸짜리 int들어가는 빈 배열
		int[] ar2 = { 123, 1, 45, 4, 21 }; // 데이터 5개 넣어서 배열 만들기
		// ar[5] = 10;
		// ar2[5] = 100; 	// 데이터 추가 불가능
		System.out.println(ar2[3]); // 코드만 봐서 뭘 의미하나?
		Arrays.sort(ar2);	// 배열 정렬하기
		for (int i : ar2) {
			System.out.println(i);
		}
		System.out.println("---------------");
		

	}
}





