package com.lee.uc.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// ����
public class UCMain4 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("�� �� : ");
		String s = k.next();
		BufferedWriter bw = null;
		try {
			// ������ ������ �������
			// ������ �ȸ������
			// ���� �ڿ� ��� �߰��ҰŸ� true
			FileWriter fw = new FileWriter("D:\\JAVA/0618.txt", true);
			bw = new BufferedWriter(fw);
			bw.write(s + "\r\n");
			bw.flush();
			int a = 10 / 0;
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			bw.close(); // ������ �����߿� �ϳ��� ������ �� ó�� bw������ fw����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
