package com.kee.uc.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//UCMain���� �� ���� �����ϱ�.

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
					System.out.printf("�̸� : %s\n",sAr[0]);
					System.out.printf("������� :%s\n" ,sAr[1]);
					System.out.printf("���� :%s\n" ,sAr[2]);
					System.out.printf("���� :%s\n" ,sAr[3]);
					System.out.printf("���� :%s\n" ,sAr[4]);
					
					sum = Integer.parseInt(sAr[2]) + Integer.parseInt(sAr[3]) + Integer.parseInt(sAr[4]);
					double avg = sum / 3.0;
					System.out.printf("��� : %.1f\n",avg);
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
		System.out.printf("�л� �� : %d\n",s);
		System.out.printf("�� ��� : %.1f\n",avgAll);
	}

}
