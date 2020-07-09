package com.lee.jun15oop.main;

import com.lee.jun15oop.human.KwonKiUng;

import LML.LML;

public class OMain {
	public static void main(String[] args) {
		// 아버지
		// 출력
		
		LML a = LML.getLml();
		a.showInfo();
		
		System.out.println("-------------");
		// 권기웅, 34살, 분당사는  권기웅
		// 출력
		
		KwonKiUng kku = KwonKiUng.getKku();
		kku.showInfo();
		
		KwonKiUng b = KwonKiUng.getKku();
		b.showInfo();
		
		System.out.println(kku);
		System.out.println(b);
		
		
	}

}
