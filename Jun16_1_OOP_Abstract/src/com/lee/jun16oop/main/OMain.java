 package com.lee.jun16oop.main;

import com.lee.jun16oop.avengers.Avengers;
import com.lee.jun16oop.avengers.Hulk;
import com.lee.jun16oop.avengers.Ironman;
import com.lee.jun16oop.human.Human;

public class OMain {
	public static void main(String[] args) {
		// 홍길동, 10살인 사람
		Human h = new Human("홍길동", 10);
		// 그 사람 나이를 20살로 수정
		h.setAge(20);
		// 수정 잘됐는지 나이만 출력
		System.out.println(h.getAge());
		//전체정보 출력
		h.showInfo();
		System.out.println("--------");
		// singleton, static x
		
		// 아이언맨 is 어벤져스
		// 헐크 is 어벤져스
		// 본명이 토니, 40살, 무기이름이 빔, 컴퓨터이름이 자비스인 아이언맨
		// 정보출력
		// 공격하기 :
		Ironman i = new Ironman("토니", 40, "자비스");
		i.print();
		i.attack();
		i.smoke();
		i.drive();
		
		System.out.println("--------");
		// 본명이 배너, 30살, 무기 이름이 주먹, 바지사이즈가 40인 헐크
		// 전체정보출력
		// 공격하기 :
		Hulk hk = new Hulk("배너", 30, 40);
		hk.print();
		hk.attack();
		System.out.println("--------");
		
		// 자바는 객체를 만들면서 클래스 만들기 가능
//				클래스명? -> 익명(annoymous)
//				내부에서 만들어진 -> inner
//				Avengers로부터 상속받음
		Avengers a = new Avengers() { //어벤저스를 만든게 아니고 캡틴아메리카 만든것
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("방패 던지기");
			}
		}; 
		a.attack();
		System.out.println("--------");
//		다형성(polymorphism)
//			변수는 상위클래스(어벤져스)
//			실제 객체는 하위클래스걸로
			
//		문법적으로 말이?
//		aa : Avengers 담는 그릇
		Avengers aa = new Ironman(); // o 실제객체는 아이언맨
//		t : Thor
//		Thor t = new Ironman(); // x 토르담는그릇에 아이언맨 못들어감
//		ii : Ironman
//		Ironman ii = new Avengers(); // x 아이언맨그릇에 어벤져스(토르,헐크..)못들어감
		
//		배열
		Avengers[] ar = {i,a,hk};
		
		for (Avengers x:ar) {
			x.attack();
		}

		
	}
	

}
