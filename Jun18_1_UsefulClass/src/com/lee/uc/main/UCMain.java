package com.lee.uc.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

//deprecated
//		������ ���������
//		���� ������ �ȸ���
//		���� ���� �ڹ�(1.8.?)������ ��������
//		���� ���� �ڹ� ������ ���ټ��� �ִ�

// �ð�/��¥
public class UCMain {
	public static void main(String[] args) {
		// java.util��Ű��
		
		// Date��ü�� �⺻���� => ����ð�/��¥
		// ���
		Date d = new Date();
		System.out.println(d);
		
//		// d���� �������� ���
//		System.out.println(d.getYear());
//		// d���� ����
//		System.out.println(d.getMonth());
//		// d���� �и�
//		System.out.println(d.getMinutes());
		System.out.println("----�����Ŵϱ� ����------");
													
//		SimpleDateFormat sdf = new SimpleDateFormat(�������̸��̾ƴ϶�, �ȿ��ִ� ����������);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM a");
		String s = sdf.format(d);
		System.out.println(s);
		
		try {
			// String -> Date
			String s2 = "2019/12-31"; // �̰� ��¥���ƴ� String
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM-dd"); //String�� ��¥�� �ٲ�
			// Ư���ð���¥
			Date d2 = sdf2.parse(s2); // �ڹٰ� Ʈ����ĳġ,���ο� ������(���ܰ�������־)
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�¾ ���� ��������
		
		try {
			String s3 = "1992/1-27"; // String ������
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/M-dd"); 
			Date d3 = sdf3.parse(s3); //String�� ��¥�� �ٲ�
			System.out.println(d3);
			sdf3 = new SimpleDateFormat("E", Locale.ENGLISH); //���ϸ� ������, ��¹��ڿ� �����
			String birthYo1 = sdf3.format(d3);
			System.out.println(birthYo1);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//�����Է�(�̸�/�������/����/����/����): ȫ�浿/1999-01-01/100/90/80
//		�̸� : ȫ�浿
//		���� : 21��
//		��� : 90��
		
		Scanner k = new Scanner(System.in);
		System.out.println("�����Է�(�̸�/�������/����/����/����):");
		String v = k.next();
		String[] vAr = v.split("/");
		System.out.printf("�̸� : %s\n", vAr[0]);
		
		int sum =
		Integer.parseInt(vAr[2])+
		Integer.parseInt(vAr[3])+
		Integer.parseInt(vAr[4]);
		double avg = sum / 3.0;
		System.out.printf("��� : %.1f\n", avg);
		
		// ���� :
		// 2020(����⵵) -1992 +1
		Date now = new Date();
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy");
		String cy = sdf4.format(now);
		int curYear = Integer.parseInt(cy); //����⵵ ì��
		
		String by = vAr[1].substring(0, 4); // substring : 1�迭 ù����~4��°����
		int birthYear = Integer.parseInt(by);
		System.out.println(by);

		
		int age = curYear - birthYear + 1;
		System.out.printf("���� : %d\n", age);
	}

}
