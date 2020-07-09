package com.lee.uc.main;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

// java 한글자 : 2byte
// 입출력 : Stream

//	기본형 빨대
//		InputStream : 장치 -> 프로그램으로 가져오는 빨대(1byte)
//			InputStreamReader : 2bytes
//			BufferedReader : 1 String(라인(줄)단위)
//		OutputStream : 프로그램 -> 장치로 보내는 빨대(1byte)
//			outputStreamReader : 2bytes
//			BufferedWriter : 1 String(라인(줄)단위)

//	개조형 빨대
//		FileReader : InputStreamReader개조 -> 파일 처리하기 편하게
//		PrintStream : OutputStream 개조 -> 메소드가 다양(사용하기 편함)
//		...
public class UCMain3 {
	
	public static void main(String[] args) {
		
		// 콘솔창에 붙어있던 프로그램 -> 콘솔창 방향 빨대
		PrintStream ps = System.out;
		ps.println("ㅋ");
		System.out.println("ㅋ");
		
		// 콘솔창에 붙어있던 콘솔창 -> 프로그램 방향 빨대
		InputStream is = System.in;
		Scanner k = new Scanner(is); // InputStream 쓰기 편하게
		String a = k.next();
		System.out.println(a);
		
	}

}
