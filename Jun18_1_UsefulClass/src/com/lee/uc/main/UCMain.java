package com.lee.uc.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

//deprecated
//		옛날에 만들어진거
//		현재 실정에 안맞음
//		현재 버전 자바(1.8.?)에서는 괜찮은데
//		다음 버전 자바 나오면 없앨수도 있다

// 시간/날짜
public class UCMain {
	public static void main(String[] args) {
		// java.util패키지
		
		// Date객체를 기본생성 => 현재시간/날짜
		// 출력
		Date d = new Date();
		System.out.println(d);
		
//		// d에서 연도값만 출력
//		System.out.println(d.getYear());
//		// d에서 월만
//		System.out.println(d.getMonth());
//		// d에서 분만
//		System.out.println(d.getMinutes());
		System.out.println("----옛날거니까 딴거------");
													
//		SimpleDateFormat sdf = new SimpleDateFormat(데이터이름이아니라, 안에있는 데이터포맷);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM a");
		String s = sdf.format(d);
		System.out.println(s);
		
		try {
			// String -> Date
			String s2 = "2019/12-31"; // 이거 날짜가아닌 String
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM-dd"); //String을 날짜로 바꿈
			// 특정시간날짜
			Date d2 = sdf2.parse(s2); // 자바가 트라이캐치,스로우 강제함(예외가생길수있어서)
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//태어난 날이 무슨요일
		
		try {
			String s3 = "1992/1-27"; // String 데이터
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/M-dd"); 
			Date d3 = sdf3.parse(s3); //String을 날짜로 바꿈
			System.out.println(d3);
			sdf3 = new SimpleDateFormat("E", Locale.ENGLISH); //요일만 나오게, 출력문자열 영어로
			String birthYo1 = sdf3.format(d3);
			System.out.println(birthYo1);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//정보입력(이름/생년월일/국어/영어/수학): 홍길동/1999-01-01/100/90/80
//		이름 : 홍길동
//		나이 : 21살
//		평균 : 90점
		
		Scanner k = new Scanner(System.in);
		System.out.println("정보입력(이름/생년월일/국어/영어/수학):");
		String v = k.next();
		String[] vAr = v.split("/");
		System.out.printf("이름 : %s\n", vAr[0]);
		
		int sum =
		Integer.parseInt(vAr[2])+
		Integer.parseInt(vAr[3])+
		Integer.parseInt(vAr[4]);
		double avg = sum / 3.0;
		System.out.printf("평균 : %.1f\n", avg);
		
		// 나이 :
		// 2020(현재년도) -1992 +1
		Date now = new Date();
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy");
		String cy = sdf4.format(now);
		int curYear = Integer.parseInt(cy); //현재년도 챙김
		
		String by = vAr[1].substring(0, 4); // substring : 1배열 첫글자~4번째글자
		int birthYear = Integer.parseInt(by);
		System.out.println(by);

		
		int age = curYear - birthYear + 1;
		System.out.printf("나이 : %d\n", age);
	}

}
