package com.lee.uc.main;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

// java �ѱ��� : 2byte
// ����� : Stream

//	�⺻�� ����
//		InputStream : ��ġ -> ���α׷����� �������� ����(1byte)
//			InputStreamReader : 2bytes
//			BufferedReader : 1 String(����(��)����)
//		OutputStream : ���α׷� -> ��ġ�� ������ ����(1byte)
//			outputStreamReader : 2bytes
//			BufferedWriter : 1 String(����(��)����)

//	������ ����
//		FileReader : InputStreamReader���� -> ���� ó���ϱ� ���ϰ�
//		PrintStream : OutputStream ���� -> �޼ҵ尡 �پ�(����ϱ� ����)
//		...
public class UCMain3 {
	
	public static void main(String[] args) {
		
		// �ܼ�â�� �پ��ִ� ���α׷� -> �ܼ�â ���� ����
		PrintStream ps = System.out;
		ps.println("��");
		System.out.println("��");
		
		// �ܼ�â�� �پ��ִ� �ܼ�â -> ���α׷� ���� ����
		InputStream is = System.in;
		Scanner k = new Scanner(is); // InputStream ���� ���ϰ�
		String a = k.next();
		System.out.println(a);
		
	}

}
