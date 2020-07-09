package com.kee.uc.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//UCMain에서 쓴 파일 정리하기.

public class UCMain2 {
	public static void main(String[] args) {
		
		BufferedReader br= null;
		int s = 0;
		int sumAll = 0;
		try {
			FileReader fr = new FileReader("D:/JAVA/student.csv");
			br = new BufferedReader(fr);
			String line = null;
			String[] sAr = null;
			int sum = 0;
			
			try {
				while ((line = br.readLine()) != null){
					sAr = line.split(",");
					System.out.printf("이름 : %s\n",sAr[0]);
					System.out.printf("생년월일 :%s\n" ,sAr[1]);
					System.out.printf("국어 :%s\n" ,sAr[2]);
					System.out.printf("영어 :%s\n" ,sAr[3]);
					System.out.printf("수학 :%s\n" ,sAr[4]);
					
					sum = Integer.parseInt(sAr[2]) + Integer.parseInt(sAr[3]) + Integer.parseInt(sAr[4]);
					double avg = sum / 3.0;
					System.out.printf("평균 : %.1f\n",avg);
					sumAll += avg;
					s += 1;
					System.out.println("--------------------");
					
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		double avgAll = (sumAll / s);
		System.out.printf("학생 수 : %d\n",s);
		System.out.printf("반 평균 : %.1f\n",avgAll);
	}

}
