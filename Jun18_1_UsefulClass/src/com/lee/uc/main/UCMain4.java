package com.lee.uc.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 파일
public class UCMain4 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("쓸 거 : ");
		String s = k.next();
		BufferedWriter bw = null;
		try {
			// 파일은 없으면 만들어줌
			// 폴더는 안만들어줌
			// 쓴거 뒤에 계속 추가할거면 true
			FileWriter fw = new FileWriter("D:\\JAVA/0618.txt", true);
			bw = new BufferedWriter(fw);
			bw.write(s + "\r\n");
			bw.flush();
			int a = 10 / 0;
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			bw.close(); // 연관된 빨대중에 하나만 닫으면 다 처리 bw닫으면 fw닫음
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
