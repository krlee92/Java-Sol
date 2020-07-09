package com.lee.jun16oop.main;

import com.lee.jun16oop.product.Apple;
import com.lee.jun16oop.product.Icecream;
import com.lee.jun16oop.product.Pen;

public class OMain2 {
	public static void main(String[] args) {
		// 특별세트, 20000원, 5kg 사과
		// 정보출력
		// 주의사항 출력하기 - 씻어드쇼
		//--------------------------------
		// 죠스바, 500원 인 아이스크림
		// 정보출력
		// 주의사항 출력하기 - 냉동보관
		//--------------------------------
		// 모나미153, 300원, 파랑 펜
		// 정보출력
		// 주의사항 출력하기 - 먹지마
		Apple a = new Apple("특별세트", 20000, 5);
		a.printInfo();
		a.notice();
		System.out.println("-------");
		Icecream i = new Icecream("죠스바", 500);
		i.printInfo();
		i.notice();
		System.out.println("-------");
		Pen p = new Pen("모나미153", 300, "파랑");
		p.printInfo();
		p.notice();
		
	}

}
