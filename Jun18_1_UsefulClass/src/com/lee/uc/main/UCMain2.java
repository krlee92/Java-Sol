package com.lee.uc.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class UCMain2 {
	public static void main(String[] args) {
		// 정보입력(이름/유통기한) : 요구르트/20200303
		// 요구르트 먹어도?
		
		// 1.연도비교, 월 비교, 일 비교
		// 2.숫자비교
		// 3.
		
		// 2.
//		Scanner k = new Scanner(System.in);
//		System.out.println("제품명/유통기한:");
//		String v = k.next();
//		String[] vAr = v.split("/");
//		int s = Integer.parseInt(vAr[1]); //숫자로바꿈
//		
//		Date now = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//		String cy = sdf.format(now); //아직까진 String임
//		int curYear = Integer.parseInt(cy); 
//		
//		if (s >= curYear) {
//			System.out.println("요구르트 먹지마");
//		} else {
//			System.out.println("요구르트 먹어도대");
//		}
		
		Scanner k = new Scanner(System.in);
		System.out.println("제품명/유통기한:");
		String v = k.next();
		String[] vAr = v.split("/");
		Date now = new Date(); //현재날짜
		
		try {
			String ed = vAr[1];
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date expDate =  sdf.parse(ed);
			
			now.before(expDate);
			String cmt = now.before(expDate) ? "먹어" : "안돼";
//			String cmt = now.before(expDate) == true는 안해도됨, == false는 결과를 뒤집자 (!now.before(expDate))
			System.out.printf("%s %s", vAr[0], cmt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
