package com.lee.uc.main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UCMain3_���� {
	public static void main(String[] args) {
		// ����(a,b,c,d..) : 10,20,3,.....
		// �հ� ���

		Scanner k = new Scanner(System.in);
		System.out.println("����(a,b,c,d,...):");
		String v = k.next();

		StringTokenizer st = new StringTokenizer(v, ",");
		int hab = 0;

		while (st.hasMoreTokens()) {
			try {
				hab += Integer.parseInt(st.nextToken()/* ���ڸ��� ���ڸ����;���, ���ڿ��� ���� */);
			} catch (Exception e) {
				
			}
		}
		System.out.println(hab);
		System.out.println("���ڸ�");

		// ����(a,b,c,d..) : 10,dd20,g3,..... �̻��Ѱż����� �ǰ�
			// try catch ���(���� ���͵� �Ѿ��)
	}

}
