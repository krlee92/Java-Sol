package com.lee.uc.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class UCMain2 {
	public static void main(String[] args) {
		// �����Է�(�̸�/�������) : �䱸��Ʈ/20200303
		// �䱸��Ʈ �Ծ?
		
		// 1.������, �� ��, �� ��
		// 2.���ں�
		// 3.
		
		// 2.
//		Scanner k = new Scanner(System.in);
//		System.out.println("��ǰ��/�������:");
//		String v = k.next();
//		String[] vAr = v.split("/");
//		int s = Integer.parseInt(vAr[1]); //���ڷιٲ�
//		
//		Date now = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//		String cy = sdf.format(now); //�������� String��
//		int curYear = Integer.parseInt(cy); 
//		
//		if (s >= curYear) {
//			System.out.println("�䱸��Ʈ ������");
//		} else {
//			System.out.println("�䱸��Ʈ �Ծ��");
//		}
		
		Scanner k = new Scanner(System.in);
		System.out.println("��ǰ��/�������:");
		String v = k.next();
		String[] vAr = v.split("/");
		Date now = new Date(); //���糯¥
		
		try {
			String ed = vAr[1];
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date expDate =  sdf.parse(ed);
			
			now.before(expDate);
			String cmt = now.before(expDate) ? "�Ծ�" : "�ȵ�";
//			String cmt = now.before(expDate) == true�� ���ص���, == false�� ����� ������ (!now.before(expDate))
			System.out.printf("%s %s", vAr[0], cmt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
