package com.kee.uc.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 데이터
//		CPU : 연산장치
//		RAM : 재부팅하면 다 지워지는 저장장치 ->변수
//			static/stack : 프로그램 꺼지면 데이터 자동증발
//			heap : 원래는 아닌데 (자바,파이썬은)GarbageCollection -> 프로그램 꺼지면 데이터 자동증발
//		HDD : 영구 저장장치 -> 파일
//		GPU (그래픽 처리용 CPU+RAM+HDD)

// 확장자 : MS Windows에만 있음(사람 보기좋으라고)
// 
// 파일명.확장자
// 엑셀파일 - x 
//	.xls => 엑셀에서 열면 잘 열리는 파일(엑셀 전용파일-x)
// 메모장파일 - x
//	.txt
// 그림판파일 - x
//	.bmp

// Comma Separated value - csv파일 => 엑셀에서 잘 열림, 메모장에서도 잘열림
// A,B,C,... ,로 구분하는파일
public class UCMain {
	public static void main(String[] args) {
		// 이름 :
		// 생년월일(yyyyMMdd)
		// 국어:
		// 영어:
		// 수학:
		//--------------------
		// 이름 :
		// 생년월일(yyyyMMdd)
		// 국어:
		// 영어:
		// 수학:
		//....
		// 이름: 끝이라고 쓰면 그만하게
		
		// 쓴 데이터 다 저장하게 만들기.
		
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter("D:/JAVA/student.csv", true);
			bw = new BufferedWriter(fw);
			String data = null;
			Scanner k = new Scanner(System.in);
			String name = null;
			String br = null;
			int kor = 0;
			int eng = 0;
			int mat = 0;
			while (true) {
				System.out.println("이름 :");
				 name = k.next();
				 if (name.equals("끝")) {
					break;
				}
				System.out.println("생년월일(yyyyMMdd) :");
				 br = k.next();
				System.out.println("국어 :");
				 kor = k.nextInt();
				System.out.println("영어 :");
				 eng= k.nextInt();
				System.out.println("수학 :");
				 mat = k.nextInt();
				 
				 data = String.format("%s,%s,%d,%d,%d\r\n", name,br,kor,eng,mat);
				 bw.write(data);
				 bw.flush();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
