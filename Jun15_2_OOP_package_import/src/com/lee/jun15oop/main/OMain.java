package com.lee.jun15oop.main;
//	패키지 : 클래스명 중복될 때 구분할 수단

//			=> 전 세계적으로 중복 안되게 만들어야
//			com.회사명.프로젝트명.주제
//			kr.co.회사명
//			....
//			default 패키지 안쓴다

//		클래스 - 패키지 안에

//ctrl + shift + o : import 정리. 없는거 넣어주고 쓸데없는거 빼주고
import java.util.Scanner;

// 패키지명 생략 가능한경우- 생략가능한건 생략함
//		1.자바 기본 패키지(java.lang)
//			java.lang.String s = new java.lang.String("ㅋ");
//			->String s = new String("ㅋ");
//		2.같은 패키지 안에 있을때
//			OMain2 o = new OMain2();
//		3.OMain에서는 과일 사과만 쓸거다 = 회사 사과는 안쓴다는것
//			회사 사과를 쓰려면 정식 풀네임 써야함 -> com.lee.jun15oop.company.Apple a2 = new com.lee.jun15oop.company.Apple();
import com.lee.jun15oop.fruit.Apple; // 21번줄 자바로번역한것.
// 이제 여기서 Apple쓰면 그거는 fruit패키지의 Apple

public class OMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Apple aa = new Apple();
		aa.test();

		com.lee.jun15oop.fruit.Apple a1 = new com.lee.jun15oop.fruit.Apple();
		a1.test();

		com.lee.jun15oop.company.Apple a2 = new com.lee.jun15oop.company.Apple();
		a2.test();

	}

}
