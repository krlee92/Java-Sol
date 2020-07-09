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
//통신
//HTTP통신 : 인터넷
//Socket통신 : 실시간


//전화번호 : IP주소 :192.168.0.88 // 39 , 91 	cmd -ipconfig
//서비스	 : 포트번호 : 본인이 정하는

//cmd


// 서버 : 서비스를 제공하는 컴퓨터
//		포트번호 : 0~65536 - 
//192.168.0.88 본인
// 클라이언트 : 서비스를 이용하는 컴퓨터

public class SSMain {
	public static void main(String[] args) throws IOException {
		// 서비스 시작
		ServerSocket sss = new ServerSocket(8888);
		ServerSocket ss = new ServerSocket(4444);
		System.out.println("서비스 점검중입니다");
		
		// 접속허가
		Socket s = ss.accept();
		System.out.println("장진태님이 접속함");
		Socket s2 = sss.accept();
		System.out.println("김지원님이 접속함");
		
		// 프로그램 -> 장치
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
			System.out.printf("보낼거 :");
			String cmt = k.next();
			bw.write(cmt + "\r\n");
			bw.flush();// 빨대 용량 다 안채워도 강제전송
			
			
			System.out.println(br2.readLine());
			String cmt2 = k.next();
			System.out.printf("보낼거 :");
			bw2.write(cmt2 + "\r\n");
			bw2.flush();
			
		}
		
		
		// 장치 -> 프로그램
		
		
	}

}
