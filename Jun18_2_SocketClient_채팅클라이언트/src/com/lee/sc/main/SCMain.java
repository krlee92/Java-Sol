package com.lee.sc.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SCMain {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// ����
//		Socket s = new Socket("ip�ּ�", ��Ʈ��ȣ)
		Socket s = new Socket("192.168.0.39", 4455);
		System.out.println("���ӵ�");
		Socket s2 = new Socket("192.168.0.91", 1150);
		
		OutputStream os =  s.getOutputStream();
		OutputStream os2 = s2.getOutputStream();
		OutputStreamWriter osw =  new OutputStreamWriter(os);
		OutputStreamWriter osw2 = new OutputStreamWriter(os2);
		BufferedWriter bw = new BufferedWriter(osw);
		BufferedWriter bw2 = new BufferedWriter(osw2);
		
		// ��ġ -> ���α׷�
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		InputStream is2 = s2.getInputStream();
		InputStreamReader isr2 = new InputStreamReader(is2);
		BufferedReader br2 = new BufferedReader(isr2);
		
		System.out.println(br.readLine());
		System.out.println(br2.readLine());
		Scanner k = new Scanner(System.in);
		while (true) {
			
			System.out.printf("������ :");
			String cmt = k.next();
			
			bw.write(cmt + "\r\n");
			bw2.write(cmt + "\r\n");
			bw.flush();// ���� �뷮 �� ��ä���� ��������
			bw2.flush();
			System.out.println(br.readLine());
			System.out.println(br2.readLine());
		}
	}

}
