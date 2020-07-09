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
		// 접속
//		Socket s = new Socket("ip주소", 포트번호)
		Socket s = new Socket("192.168.0.39", 4455);
		System.out.println("접속됨");
		Socket s2 = new Socket("192.168.0.91", 1150);
		
		OutputStream os =  s.getOutputStream();
		OutputStream os2 = s2.getOutputStream();
		OutputStreamWriter osw =  new OutputStreamWriter(os);
		OutputStreamWriter osw2 = new OutputStreamWriter(os2);
		BufferedWriter bw = new BufferedWriter(osw);
		BufferedWriter bw2 = new BufferedWriter(osw2);
		
		// 장치 -> 프로그램
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
			
			System.out.printf("보낼거 :");
			String cmt = k.next();
			
			bw.write(cmt + "\r\n");
			bw2.write(cmt + "\r\n");
			bw.flush();// 빨대 용량 다 안채워도 강제전송
			bw2.flush();
			System.out.println(br.readLine());
			System.out.println(br2.readLine());
		}
	}

}
