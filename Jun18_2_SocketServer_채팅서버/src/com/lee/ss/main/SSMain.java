package com.lee.ss.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//���
//HTTP��� : ���ͳ�
//Socket��� : �ǽð�


//��ȭ��ȣ : IP�ּ� :192.168.0.88 // 39 , 91 	cmd -ipconfig
//����	 : ��Ʈ��ȣ : ������ ���ϴ�

//cmd


// ���� : ���񽺸� �����ϴ� ��ǻ��
//		��Ʈ��ȣ : 0~65536 - 
//192.168.0.88 ����
// Ŭ���̾�Ʈ : ���񽺸� �̿��ϴ� ��ǻ��

public class SSMain {
	public static void main(String[] args) throws IOException {
		// ���� ����
		ServerSocket sss = new ServerSocket(8888);
		ServerSocket ss = new ServerSocket(4444);
		System.out.println("���� �������Դϴ�");
		
		// �����㰡
		Socket s = ss.accept();
		System.out.println("�����´��� ������");
		Socket s2 = sss.accept();
		System.out.println("���������� ������");
		
		// ���α׷� -> ��ġ
		OutputStream os =  s.getOutputStream();
		OutputStream os2 = s2.getOutputStream();
		OutputStreamWriter osw =  new OutputStreamWriter(os);
		OutputStreamWriter osw2 = new OutputStreamWriter(os2);
		BufferedWriter bw = new BufferedWriter(osw);
		BufferedWriter bw2 = new BufferedWriter(osw2);
		
		Scanner k = new Scanner(System.in);
		
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		InputStream is2 = s2.getInputStream();
		InputStreamReader isr2 = new InputStreamReader(is2);
		BufferedReader br2 = new BufferedReader(isr2);
		
		while (true) {
			
			System.out.println(br.readLine());
			System.out.printf("������ :");
			String cmt = k.next();
			bw.write(cmt + "\r\n");
			bw.flush();// ���� �뷮 �� ��ä���� ��������
			
			
			System.out.println(br2.readLine());
			String cmt2 = k.next();
			System.out.printf("������ :");
			bw2.write(cmt2 + "\r\n");
			bw2.flush();
			
		}
		
		
		// ��ġ -> ���α׷�
		
		
	}

}
