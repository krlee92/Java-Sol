package com.lee.uc.main;

import java.util.StringTokenizer;

public class UCMain_String���ڿ�Ȱ�� {
	public static void main(String[] args) {
//		String : ������ �Ұ����� ���ڿ� ��ü, Ŭ������ ��ü�� ���赵
//		String s = "������"; =
		String s = new String("�� ���� ���� �����ǵ���");
		
//		s.�޼ҵ��(�Ķ����) -���ϰ�,???��(����)
		
		// ����° ���ڸ�
		System.out.println(s.charAt(2)); // ���⵵ ����
		
		// s �� ����� -> ���� ��(int,������ int)
		System.out.println(s.length());
		
		// �ι�° ���� ~ �ټ����� ���ڱ��� -> string
		System.out.println(s.substring(1, 5));
		
		// '��'�� ������
		System.out.println(s.endsWith("��"));
		
		// '����' �� ���ֳ�
		System.out.println(s.contains("����"));
		System.out.println("-----------------------");
		
		// s �ڿ� ȸ���� ���� �Ҷ��� ���̱�
//		s += "ȸ���� ���� �ϰԿ�";
//		s = s + "ȸ���� ���� �ϰԿ�";
//		s = new String(s + "ȸ���� ���� �ϰԿ�");
//		System.out.println(s);
		
		//���ڿ� �뷮 ���̱�
		StringBuffer sb = new StringBuffer();
		sb.append("������");
		sb.append("������");
		String ss = sb.toString();
		System.out.println(ss);
		///////////////////////////////////////
		// ���ڿ� �и�
		String data = "ȫ�浿/20/180/80"; // ��ġ�� �߿� -> ����°�ڸ� :Ű
		String[] sAr = data.split("/"); //�и��ϰ�
		System.out.println(sAr[0]); //��ġ������ ����
		System.out.println(sAr[2]); //slpit �޼ҵ�� ��ġ���� �߿��Ҷ� ���
		
		String data2 = "�� ���� ���� �̳Ĵϱ��";
		StringTokenizer st = new StringTokenizer(data2, " ");
//											 (�ڸ�������,������)
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		///////////////////////////////////////////
		// ���� �����ؼ� ���ڿ� �����
		for (int i = 1; i < 41; i++) {
			String s4 = String.format("�л�%02d.txt", i);
			System.out.println(s4);
		} //�л�����1~40������ ����..
		// bus2015.txt
		// bus2016.txt
		// bus2017.txt
		// ...
		// bus2020.txt
		
		
	}

}
