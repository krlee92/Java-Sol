package com.lee.jun15oop.main;

import com.lee.jun15oop.human.KwonKiUng;

import LML.LML;

public class OMain {
	public static void main(String[] args) {
		// �ƹ���
		// ���
		
		LML a = LML.getLml();
		a.showInfo();
		
		System.out.println("-------------");
		// �Ǳ��, 34��, �д���  �Ǳ��
		// ���
		
		KwonKiUng kku = KwonKiUng.getKku();
		kku.showInfo();
		
		KwonKiUng b = KwonKiUng.getKku();
		b.showInfo();
		
		System.out.println(kku);
		System.out.println(b);
		
		
	}

}
