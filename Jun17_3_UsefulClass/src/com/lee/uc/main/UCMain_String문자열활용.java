package com.lee.uc.main;

import java.util.StringTokenizer;

public class UCMain_String문자열활용 {
	public static void main(String[] args) {
//		String : 수정이 불가능한 문자열 객체, 클래스는 객체의 설계도
//		String s = "ㅋㅋㅋ"; =
		String s = new String("아 반장 언제 뽑을건데요");
		
//		s.메소드명(파라메터) -리턴값,???값(무시)
		
		// 세번째 글자만
		System.out.println(s.charAt(2)); // 띄어쓰기도 글자
		
		// s 총 몇글자 -> 글자 수(int,리턴이 int)
		System.out.println(s.length());
		
		// 두번째 글자 ~ 다섯번재 글자까지 -> string
		System.out.println(s.substring(1, 5));
		
		// '요'로 끝나나
		System.out.println(s.endsWith("요"));
		
		// '반장' 이 들어가있나
		System.out.println(s.contains("반장"));
		System.out.println("-----------------------");
		
		// s 뒤에 회식은 언제 할라고요 붙이기
//		s += "회식은 언제 하게요";
//		s = s + "회식은 언제 하게요";
//		s = new String(s + "회식은 언제 하게요");
//		System.out.println(s);
		
		//문자열 대량 붙이기
		StringBuffer sb = new StringBuffer();
		sb.append("ㅋㅋㅋ");
		sb.append("ㅎㅎㅎ");
		String ss = sb.toString();
		System.out.println(ss);
		///////////////////////////////////////
		// 문자열 분리
		String data = "홍길동/20/180/80"; // 위치가 중요 -> 세번째자리 :키
		String[] sAr = data.split("/"); //분리하고
		System.out.println(sAr[0]); //위치값으로 구분
		System.out.println(sAr[2]); //slpit 메소드는 위치값이 중요할때 사용
		
		String data2 = "아 반장 언제 뽑냐니까요";
		StringTokenizer st = new StringTokenizer(data2, " ");
//											 (자를데이터,구분자)
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		///////////////////////////////////////////
		// 형식 지정해서 문자열 만들기
		for (int i = 1; i < 41; i++) {
			String s4 = String.format("학생%02d.txt", i);
			System.out.println(s4);
		} //학생파일1~40번까지 열기..
		// bus2015.txt
		// bus2016.txt
		// bus2017.txt
		// ...
		// bus2020.txt
		
		
	}

}
