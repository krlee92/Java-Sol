package com.lee.jun15oop.main;

import java.util.Scanner;

import com.lee.jun15oop.animal.Bug;
import com.lee.jun15oop.animal.Dog;
import com.lee.jun15oop.coffee.Coffee;
import com.lee.jun15oop.menu.Menu;

public class OMain {
	public static void main(String[] args) {
		// 콘솔입력받을준비
//			벌레객체 생성
//			이름 입력받아서 벌레 이름으로 셋팅
//			크기 입력받아서 벌레 크기로 셋팅
//			벌레 정보 출력
		Scanner k = new Scanner(System.in);
		Bug b = new Bug();
		System.out.print("이름 : ");
//		b.name = k.next();
		b.setName(k.next());
		System.out.print("크기 : ");
//		b.size = k.nextInt();
		b.setSize(k.nextInt());
		b.printInfo();
		System.out.println("----------------");
		// 메뉴객체 생성
//			메뉴명
//			돈 얼마 더 냈나
//			정보 출력
		Menu m = new Menu();
		m.setName("안");
		m.setPrice(0);
		m.setGood(false);
		m.showInfo();
		
		System.out.println("----------------");
		Coffee a = new Coffee("아메리카노", 4000);
		a.printInfo();
		System.out.println("----------------");
		// 개를 생성
//				뽀삐
//				2살
//				출력
		Dog d = new Dog();
		d.name = "뽀삐";
		d.age = 2;
		d.printInfo(); 
	}

}
